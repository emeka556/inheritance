package ie.wit.ictskills.shapes;

import java.awt.geom.Ellipse2D;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */

public class Circle extends Ellipse implements Measurable

{
	private int diameter;

	/**
	 * Create a new circle at default position with default color.
	 */

	public Circle() {
		// Invokes super class Ellipse with xDiameter & yDiameter == 100 units
		// Default circle positioned at 0,0
		super(120, 120, 0, 0, "red");
	}

	public Circle(int diameter, int xPosition, int yPosition, String color) {
		super(diameter, diameter, xPosition, yPosition, color);
	}

	/**
	 * Change the size to the new size (in pixels). Size must be >= 0.
	 */
	public void changeSize(int newDiameter) {
		erase();
		diameter = newDiameter;
		draw();
	}

	

	/**
	 * Main method that allows the Circle object created to be displayed
	 * 
	 */
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.makeVisible();
		circle.draw();
	}

	public interface Measurable1 {
		double perimeter();
	}

	@Override
	public double perimeter() {

		return Math.PI * diameter;
	}
}
