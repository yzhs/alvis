package de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations;

import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author Frank Weiler enumeration for colors
 */
public enum AlvisColor {
	white(255, 255, 255), black(0, 0, 0), gray(216, 228, 248), grey(216, 228,
			248), green(0, 255, 0), lime(50, 205, 50), yellow(255, 255, 0), orange(
			255, 165, 0), red(255, 0, 0), penis(254, 246, 225), pink(255, 192,
			203), crimson(220, 20, 60), magenta(255, 0, 255), violet(127, 0,
			255), purple(127, 0, 127), blue(0, 0, 255), cyan(0, 255, 255), turquoise(
			0, 255, 255);

	public final int R, G, B;

	private AlvisColor(int red, int green, int blue) {
		R = red;
		G = green;
		B = blue;
	}

	@Override
	public String toString() {
		return name();
	}

	/**
	 * returns the enum according to the name, white if nothing found
	 * 
	 * @param name
	 *            the name of the enum that is to be found, spelling is case
	 *            insensitive
	 * @return the enum according to the name, white if nothing found
	 */
	public static AlvisColor getAlvisColor(String name) {
		String namei = name.toLowerCase();
		AlvisColor[] acs = AlvisColor.values();
		for (int i = 0; i < acs.length; i++) {
			if (acs[i].toString().equals(namei))
				return acs[i];
		}
		return white;
	}

	/**
	 * returns name of given color, 'colorful' if not listed in enum
	 * 
	 * @param color
	 *            the color to name
	 * @return name of given color, 'colorful' if not listed in enum
	 */
	public static String getAlvisColor(Color color) {
		AlvisColor[] acs = AlvisColor.values();
		for (int i = 0; i < acs.length; i++) {
			if (acs[i].R == color.getRed() && acs[i].G == color.getGreen()
					&& acs[i].B == color.getBlue())
				return acs[i].toString();
		}
		return "colorful";
	}

	/**
	 * returns color according to enum
	 * 
	 * @return color according to enum
	 */
	public Color color() {
		return new Color(null, R, G, B);
	}
}
