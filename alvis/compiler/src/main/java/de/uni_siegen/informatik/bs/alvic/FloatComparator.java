package de.uni_siegen.informatik.bs.alvic;

import java.util.Comparator;

/**
 * Comparator to compare floats.
 * 
 * @author simon
 * 
 * @param <T>
 */
public class FloatComparator<T> implements Comparator<Float> {
	public int compare(Float o1, Float o2) {
		if (o1 > o2)
			return -1;
		if (o2 > o1)
			return 1;
		return 0;
	}
}
