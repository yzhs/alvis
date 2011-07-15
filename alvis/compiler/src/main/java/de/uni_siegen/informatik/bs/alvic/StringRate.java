package de.uni_siegen.informatik.bs.alvic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */

/**
 * This class offers a method to rate the similarity of two given Strings.
 * 
 * @author simon
 * 
 */
public class StringRate {

	/**
	 * 
	 * @param arg0
	 *            the first string
	 * @param arg1
	 *            the second string
	 * @return a float between 0.0 and 1.0 that is higher the more similar the
	 *         two strings are.
	 */
	public static float calcStringMatching(String arg0, String arg1) {

		arg0 = arg0.toLowerCase();
		arg1 = arg1.toLowerCase();

		// If they are the Same
		if (arg0.equals(arg1))
			return 1;

		int maxLength = Math.max(arg0.length(), arg1.length());

		char[] char0;
		char[] char1;
		if (arg0.length() != arg1.length()) { // the strings have dif. length
			if (arg0.length() > arg1.length()) {
				// arg1 is smaller
				char0 = arg0.toCharArray();
				char1 = new char[maxLength];
				for (int i = 0; i < arg1.length(); i++) {
					char1[i] = 23; // Set the char to the sharp
					char1[i] = arg1.charAt(i); // Set to the right char
				}
			} else { // arg2 is smaller
				char1 = arg1.toCharArray();
				char0 = new char[maxLength];
				for (int i = 0; i < arg0.length(); i++) {
					char0[i] = 23; // Set the char to the sharp
					char0[i] = arg0.charAt(i); // Set to the right char
				}
			}
		} else {
			char0 = arg0.toCharArray();
			char1 = arg1.toCharArray();
		}

		float maxP = (float) 1 / (float) maxLength;
		float[] p = new float[maxLength];
		for (int i = 0; i < maxLength; i++) {
			p[i] = (float) (maxP / Math.pow(2, i));
		}

		ArrayList<Float> possibles = new ArrayList<Float>();

		for (int i = 0; i < char0.length; i++) {
			for (int j = 0; j < char1.length; j++) {

				if (char0[i] == char1[j]) {
					possibles.add(p[Math.abs(i - j)]);

				}
			}
		}
		Comparator<Float> comp = new FloatComparator<Float>();
		Collections.sort(possibles, comp);
		int count = 0;
		float retVal = 0;
		for (float f : possibles) {
			if (maxLength <= count)
				break;
			retVal += f;
			count++;
		}

		return retVal;
	}
}
