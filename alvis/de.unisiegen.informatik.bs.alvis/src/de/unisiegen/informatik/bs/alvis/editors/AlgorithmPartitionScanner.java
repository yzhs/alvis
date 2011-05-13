/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.util.ArrayList;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Eduard Boos
 * 
 */
public class AlgorithmPartitionScanner extends RuleBasedPartitionScanner {

	public final static String MULTILINE_COMMENT = "multiline_comment";
	public final static String SINGLELINE_COMMENT = "singleline_comment";
	public final static String BEGIN_END = "begin_end";
	public final static String[] PARTITION_TYPES = new String[] {
			MULTILINE_COMMENT, SINGLELINE_COMMENT, BEGIN_END };

	public AlgorithmPartitionScanner() {
		IToken multilineComment = new Token(MULTILINE_COMMENT);
		IToken singlelineComment = new Token(SINGLELINE_COMMENT);
		IToken beginEnd = new Token(BEGIN_END);

		ArrayList<IPredicateRule> rules = new ArrayList<IPredicateRule>();

		// Add rule for Singleline Comment
		rules.add(new EndOfLineRule("//", singlelineComment));
		// Add rule for Multiline Comment
		rules.add(new MultiLineRule("/*", "*/", multilineComment, (char) 0,
				true));

		// Add rule for begin and end sequence
		rules.add(new MultiLineRule("begin", "end", beginEnd));

		IPredicateRule[] result = new IPredicateRule[rules.size()];
		for (int i = 0; i < rules.size(); i++) {
			result[i] = rules.get(i);
		}
		setPredicateRules(result);
	}
}
