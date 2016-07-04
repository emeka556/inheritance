package ie.wit.ictskills.shapes;

// Complete Ellipse, inherit Shapes, implement Measurable, subclass Circle.
import ie.wit.ictskills.util.ellipse.EllipseMeasure;

import java.awt.geom.*;

/**
 * An ellipse that can be manipulated and that draws itself on a canvas.
 * 
 * @author
 * 
 * @version
 */

public class Ellipse extends Shapes implements Measurable {

	private int majorDiameter;
	private int minorDiameter;

	public Ellipse() {
		super(120, 180, "green", true);
		this.majorDiameter = 80;
		this.minorDiameter = 40;
	}

	public Ellipse(int majorDiameter, int minorDiameter, int x, int y, String color) {
		super(x, y, color, true);
		this.majorDiameter = majorDiameter;
		this.minorDiameter = minorDiameter;

	}

	public void changeSize(int scale) {
		super.erase();
		majorDiameter *= scale;
		minorDiameter *= scale;
		draw();
	}

	void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, majorDiameter, minorDiameter));
			canvas.wait(10);
		}
	}

	
	public double perimeter(double xDiameter, double yDiameter) {
		double a = xDiameter / 2.0;
		double b = yDiameter / 2.0;
		double h = Math.pow(a - b, 2) / Math.pow(a + b, 2);
		return Math.PI * (a + b) * (1 + h / 4 + Math.pow(h, 2) / 64 + Math.pow(h, 3) / 256 + Math.pow(h, 4) / 16384);
	}

	@Override
	public double perimeter() {

		return 0;
	}

	public static void main(String[] args) {
		Ellipse ellipse = new Ellipse();
		ellipse.makeVisible();
		ellipse.draw();
	}

}
