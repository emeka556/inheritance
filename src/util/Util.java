package util;

import ie.wit.ictskills.shapes.Measurable;

import java.util.ArrayList;

public class Util {
	/**
	 * Measureable interface contains the method double perimeter(). The method
	 * maximum here evalutates the single value representing the largest
	 * perimeter discovered in the list of Measurable objects.
	 *
	 * @param object
	 *            The list of objects whose classes implement the interface
	 *            Measurable
	 * @return Returns the largest perimeter discovered among entire list
	 *         objects.
	 */
	static public double maximum(ArrayList<Measurable> object) {
		double max = 0;

		for (Measurable mesure : object)
			max = mesure.perimeter() > max ? mesure.perimeter() : max;
		return max;
	}
}
