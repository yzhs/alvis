/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.editors;

/*
 * Copyright (c) 2011  Eduard Boos
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
import java.util.ArrayList;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * Partition Scanner used to Partition the document into Parts where it can be
 * e.g. displayed differently based on the part you are displaying. For example
 * you do not want to highlight Keywords in comment parts.
 * 
 * @author Eduard Boos
 * 
 */
public class AlgorithmPartitionScanner extends RuleBasedPartitionScanner {

	public final static String MULTILINE_COMMENT = "multiline_comment"; //$NON-NLS-1$
	public final static String SINGLELINE_COMMENT = "singleline_comment"; //$NON-NLS-1$
	public final static String[] PARTITION_TYPES = new String[] {
			MULTILINE_COMMENT, SINGLELINE_COMMENT};

	public AlgorithmPartitionScanner() {
		IToken multilineComment = new Token(MULTILINE_COMMENT);
		IToken singlelineComment = new Token(SINGLELINE_COMMENT);

		ArrayList<IPredicateRule> rules = new ArrayList<IPredicateRule>();

		// Add rule for Singleline Comment
		rules.add(new EndOfLineRule("//", singlelineComment)); //$NON-NLS-1$
		// Add rule for Multiline Comment
		rules.add(new MultiLineRule("/*", "*/", multilineComment, (char) 0, //$NON-NLS-1$ //$NON-NLS-2$
				true));

		IPredicateRule[] result = new IPredicateRule[rules.size()];
		for (int i = 0; i < rules.size(); i++) {
			result[i] = rules.get(i);
		}
		setPredicateRules(result);
	}
}
