package ie.wit.ictskills.shapes;

/**
 * An abstract class describing geometric shapes
 * 
 
 * @version 2016-04-12
 */
public abstract class Shapes {
	int xPosition;
	int yPosition;
	String color;
	boolean isVisible;

	public Shapes(int xPosition, int yPosition, String color, boolean isVisible) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.color = color;
		this.isVisible = isVisible;
	}

	abstract void draw();

	abstract void changeSize(int scale);

	public void changeColor(String color) {
		this.color = color;
		draw();
	}

	public void makeVisible() {
		isVisible = true;
		draw();
	}

	public void makeInvisible() {
		erase();
		isVisible = false;
	}

	protected void erase() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.erase(this);
		}
	}

	public double perimeter(double xDiameter, double yDiameter) {

		return 0;
	}

}
