package de.uni_siegen.informatik.bs.alvic;

import java.util.List;
import java.util.ArrayList;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 * The super class of the generated type checker.
 * 
 * @author Colin
 */
public abstract class AbstractTypeChecker extends TreeParser {
	/**
	 * List of all exceptions created during type checking.
	 */
	private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();

	/**
	 * Create a new parser instance, pre-supplying the input token stream.
	 * 
	 * @param input
	 *            The stream of tokens that will be pulled from the lexer
	 */
	protected AbstractTypeChecker(TreeNodeStream input) {
		super(input);
	}

	/**
	 * Create a new parser instance, pre-supplying the input token stream and
	 * the shared state.
	 * 
	 * This is only used when a grammar is imported into another grammar, but we
	 * must supply this constructor to satisfy the super class contract.
	 * 
	 * @param input
	 *            The stream of tokens that will be pulled from the lexer
	 * @param state
	 *            The shared state object created by an interconnected grammar
	 */
	protected AbstractTypeChecker(TreeNodeStream input,
			RecognizerSharedState state) {
		super(input, state);
	}

	/**
	 * Get the type of a symbol from the symbol table if it is valid in the
	 * current scope.
	 * 
	 * @param id
	 *            The symbol's name
	 * @return The type the symbol has, or 'null' if it is not defined in the
	 *         current scope
	 */
	abstract protected Type getTypeByName(String id);

	/**
	 * Returns whether the object is defined in the current scope.
	 * 
	 * @param id
	 *            The symbols's name
	 * @return Whether symbol 'id' is defined
	 */
	protected boolean isDefined(String id) {
		return null != getTypeByName(id);
	}

	/**
	 * @return all exceptions produced by the type checker.
	 */
	public List<RecognitionException> getExceptions() {
		return exceptions;
	}

	/**
	 * Adds exception to the list of all exceptions. However, this is done only
	 * when the exception was not caused by an earlier exception (this is
	 * detected by looking if there is a '#' in e.toString()).
	 * 
	 * @param e
	 *            The exception
	 */
	@Override
	public void reportError(RecognitionException e) {
		/*
		 * If the exception contains a '#' it was created because of an earlier
		 * errors so we ignore it, as it will go away when the user fixes that
		 * earlier error.
		 */
		if (!e.toString().contains("#")) {
			System.err.println(e);
			exceptions.add(e);
		}
	}

	/**
	 * Checks whether the number of arguments an the type of each argument a
	 * function is given matches the types the function can take as arguments.
	 * If the number of arguments or the argument types do not match it reports
	 * an appropriate exception.
	 * 
	 * @param name
	 *            the function's name
	 * @param functionType
	 *            the function's type
	 * @param arguments
	 *            the list of types of the arguments given
	 * @param token
	 *            the first token of the function call
	 */
	protected void checkArgs(String name, Type functionType,
			List<Type> arguments, CommonTree token) {
		int i = 0;
		int n = ((FunctionType) functionType).getArgumentTypes().size();

		if (arguments.size() != n) {
			reportError(new ArgumentNumberException(name, n, arguments.size(), token.getToken()));
		}

		for (Type t : ((FunctionType) functionType).getArgumentTypes())
			if (!arguments.get(i++).matches(t))
				reportError(new ArgumentTypeException(name, t, i,
						arguments.get(i - 1), token.getToken()));
	}

	/**
	 * Check whether a member of an object has the correct type and returns that
	 * type.
	 * 
	 * @param object
	 *            this object's member is checked
	 * @param member
	 *            this is the name of the member
	 * @param expected
	 *            the type that is expected where the member is referenced
	 * @param token
	 *            the first token of the member reference
	 */
	protected Type checkMember(Type object, String member, Type expected,
			CommonTree token) {
		if (!object.hasMember(member)) {
			reportError(new UnknownMemberException(object, member, token.getToken()));
			return SimpleType.create("# UnknownMember #");
		}

		for (Type t : object.getMember(member))
			if (t.matches(expected))
				return t;

		reportError(new TypeMismatchException(expected, object, member, token.getToken()));

		return SimpleType.create("# NoSuchMember #");
	}

	/**
	 * Checks whether an expression has the correct type. This is used when the
	 * type checker knows something about what type is expected to check if the
	 * expression given actually has that type. An appropriate exception is
	 * reported when they do not match.
	 * 
	 * @param expected
	 *            the type the expression is supposed to have
	 * @param actual
	 *            the type the expression actually has
	 * @param expr
	 *            the expression this is about
	 * @param token
	 *            the first token of the expression
	 */
	protected void checkTypes(Type expected, Type actual, String expr,
			CommonTree token) {
		if (actual == null || !actual.matches(expected))
			reportError(new TypeMismatchException(expected, actual, expr, token.getToken()));
	}

	/**
	 * Creates an error report when the user tries to call something that is not
	 * a function. No checking is done in this method, it just reports the
	 * error.
	 * 
	 * @param function
	 *            this is what the user tries to call
	 * @param type
	 *            its type
	 * @param token
	 *            its first token
	 */
	protected void notAFunction(String function, Type type, CommonTree token) {
		reportError(new NotAFunctionException(type, function, token.getToken()));
	}

	/**
	 * Creates an error report when the user tries to index something that is
	 * not an array. No checking is done in this method, it just reports the
	 * error.
	 * 
	 * @param array
	 *            what the user tries to index
	 * @param type
	 *            its type
	 * @param token
	 *            its first token
	 */
	protected void notAnArray(String array, Type type, CommonTree token) {
		reportError(new NotAnArrayException(type, array, token.getToken()));
	}

	/**
	 * Checks whether a specific binary operator exists and returns its return
	 * type if it does. If no such operator exists it reports an error and
	 * returns an error type.
	 * 
	 * @param op
	 *            the operator's method name (for '+' this would be 'add')
	 * @param left
	 *            the type of the left argument
	 * @param right
	 *            the type of the right argument
	 * @param text
	 *            the text of the expression the operator is used in
	 * @param start
	 *            the token associated with the operator
	 */
	protected Type returnType(String op, Type left, Type right, String text,
			CommonTree start) {
		if (!left.hasMember(op)) {
			reportError(new UnknownOperatorException(left, op, start.getToken()));
			return SimpleType.create("# UnknownOperator #");
		}

		for (Type t : left.getMember(op)) {
			if (!(t instanceof FunctionType))
				continue;

			FunctionType tmp = (FunctionType) t;
			List<Type> args = tmp.getArgumentTypes();

			if (args.size() != 1 || !right.matches(args.get(0)))
				continue;

			return tmp.getReturnType();
		}

		reportError(new NoSuchOperatorException(left, op, 1, start.getToken()));
		return SimpleType.create("# NoSuchOperator #");
	}

	/**
	 * Checks whether a specific unary operator exists and returns its return
	 * type if it does. If it does not exist the error is reported and an
	 * appropriate error type is returned.
	 * 
	 * @param op
	 *            the operator's method name
	 * @param operand
	 *            what the operator operates on
	 * @param text
	 *            the text of the expression the operator is used in
	 * @param start
	 *            the token associated with the operator
	 * @return The type of the operator's result if such an operator exists,
	 *         otherwise an error type is returned
	 */
	protected Type returnType(String op, Type operand, String text,
			CommonTree start) {
		if (!operand.hasMember(op)) {
			reportError(new UnknownMemberException(operand, op, start.getToken()));
			return SimpleType.create("# UnknownOperator #");
		}

		for (Type t : operand.getMember(op)) {
			if (!(t instanceof FunctionType))
				continue;

			FunctionType tmp = (FunctionType) t;
			if (tmp.getArgumentTypes().size() == 0)
				return tmp.getReturnType();
		}

		reportError(new NoSuchOperatorException(operand, op, 0, start.getToken()));
		return SimpleType.create("# NoSuchOperator #");
	}
}
