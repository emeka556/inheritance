package ie.wit.ictskills.shapes;
/**
 * @file    Pentagon.java
 * @brief   This class describes a pentagon and has behaviour to display, resize and move objects
 *                  
 * 
 * 
 */

// Complete Pentagon class

import java.awt.Polygon;

public class Pentagon extends Shapes implements Measurable {
	private int radius;// radius of circumscribing circle

	public Pentagon() {
		super(0, 0, "black", true);
		this.radius = 50;
	}

	public Pentagon(int radius, int xPosition, int yPosition, String color) {
		super(xPosition, yPosition, color, true);
		this.radius = radius;
	}

	public void changeSize(int scale) {
		super.erase();
		radius *= scale;
		draw();
	}

	void draw() {
		if (isVisible) {
			// Ref: http://mathworld.wolfram.com/Pentagon.html
			double dc1 = 0.25 * (Math.sqrt(5) - 1);
			double dc2 = 0.25 * (Math.sqrt(5) + 1);
			double ds1 = 0.25 * (Math.sqrt(10 + 2 * Math.sqrt(5)));
			double ds2 = 0.25 * (Math.sqrt(10 - 2 * Math.sqrt(5)));// length of
																	// pentagon
																	// side is
																	// 2*ds2
			int c1 = -(int) (radius * dc1);// radius of circle that
											// circumscribes pentagon
			int c2 = -(int) (radius * dc2);
			int s1 = (int) (radius * ds1);
			int s2 = (int) (radius * ds2);

			Canvas canvas = Canvas.getCanvas();
			int[] xpoints = { xPosition, xPosition + s1, xPosition + s2, xPosition - s2, xPosition - s1 };
			int[] ypoints = { yPosition - radius, yPosition + c1, yPosition - c2, yPosition - c2, yPosition + c1 };
			canvas.draw(this, color, new Polygon(xpoints, ypoints, 5));
			canvas.wait(10);
		}
	}

	

	/**
	 * Main method that allows the Pentagon object created to be displayed
	 * 
	 */
	public static void main(String[] args) {
		Pentagon pentagon = new Pentagon(50, 0, 0, "black");
		pentagon.makeVisible();
		pentagon.draw();
	}

	@Override
	public double perimeter() {

		return 10 * radius * Math.sin(Math.PI / 5);
	}
}
