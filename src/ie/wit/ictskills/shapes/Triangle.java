package ie.wit.ictskills.shapes;

import java.awt.Polygon;

public class Triangle extends Shapes implements Measurable {
	private int height;
	private int width;

	public Triangle() {
		// super(xPosition, yPosition, color, isVisible)
		super(150, 65, "black", true);
		this.height = 50;
		this.width = 75;
	}

	public Triangle(int height, int width, int xPosition, int yPosition, String color) {
		// super(xPosition, yPosition, color, isVisible)
		super(xPosition, yPosition, color, true);
		this.height = height;
		this.width = width;

	}

	@Override
	public double perimeter() {
		return 2 * Math.hypot(height, width / 2) + width;
	}

	@Override
	void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			int[] xpoints = { xPosition, xPosition + (width / 2), xPosition - (width / 2) };
			int[] ypoints = { yPosition, yPosition + height, yPosition + height };
			canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
			canvas.wait(10);
		}
	}

	@Override
	void changeSize(int scale) {
		erase();
		height *= scale;
		width *= scale;
		draw();

	}

	
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.makeVisible();
		triangle.draw();
	}
}
