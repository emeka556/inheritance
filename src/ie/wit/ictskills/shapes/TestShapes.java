package ie.wit.ictskills.shapes;

import java.util.ArrayList;

/**
 * Main method that allows the various shape object created to be displayed
 * 
 */
public class TestShapes {
	public static void main(String[] args) {
		ArrayList<Shapes> shapes = new ArrayList<>();

		shapes.add(new Circle(30, 20, 60, "red"));
		shapes.add(new Circle(40, 30, 70, "blue"));
		shapes.add(new Circle(50, 40, 80, "green"));
		shapes.add(new Circle(60, 50, 90, "black"));

		shapes.add(new Triangle(30, 40, 160, 50, "red"));
		shapes.add(new Triangle(40, 50, 170, 60, "blue"));
		shapes.add(new Triangle(50, 60, 180, 70, "green"));
		shapes.add(new Triangle(60, 70, 190, 80, "black"));

		shapes.add(new Rectangle(160, 30, 60, 150, "red"));
		shapes.add(new Rectangle(170, 40, 70, 160, "blue"));
		shapes.add(new Rectangle(180, 50, 80, 170, "green"));
		shapes.add(new Rectangle(190, 60, 90, 180, "black"));

		for (Shapes shape : shapes) {
			shape.makeVisible();
		}
	}
}
