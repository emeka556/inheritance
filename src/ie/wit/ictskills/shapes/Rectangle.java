package ie.wit.ictskills.shapes;

// derived from Shapes super class

public class Rectangle extends Shapes implements Measurable {
	private int xSideLength;
	private int ySideLength;

	public Rectangle() {
		super(60, 50, "red", true);
		this.xSideLength = 60;
		this.ySideLength = 30;
	}

	public Rectangle(int xSideLength, int ySideLength, int xPosition, int yPosition, String color) {
		super(xPosition, yPosition, color, true);
		this.xSideLength = xSideLength;
		this.ySideLength = ySideLength;
	}

	public void changeSize(int scale) {
		if (xSideLength > 0 && ySideLength > 0) {
			erase();
			xSideLength *= scale;
			ySideLength *= scale;
		} else {
			System.out.println("Enter positive dimensions");
		}

	}

	void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.draw(this, color, new java.awt.Rectangle(xPosition, yPosition, xSideLength, ySideLength));
			canvas.wait(10);
		}
	}

	
	/**
	 * Main method that allows the Rectangle object created to be displayed
	 * 
	 */
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(100, 50, 50, 100, "red");
		rectangle.makeVisible();
		rectangle.draw();
	}

	@Override
	public double perimeter() {

		return xSideLength * 2 + ySideLength * 2;
	}
}