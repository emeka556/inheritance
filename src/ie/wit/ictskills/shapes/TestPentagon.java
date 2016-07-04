package ie.wit.ictskills.shapes;

import java.util.ArrayList;

public class TestPentagon {

	/**
	 * Main method that allows the various object of pentagon created to be
	 * displayed
	 * 
	 */
	public static void main(String[] args) {
		// Display 4 cascaded Pentagons differently colored shapes.
		ArrayList<Shapes> shapes = new ArrayList<>();

		shapes.add(new Pentagon(50, 70, 70, "red"));
		shapes.add(new Pentagon(60, 100, 90, "blue"));
		shapes.add(new Pentagon(70, 130, 110, "green"));
		shapes.add(new Pentagon(80, 160, 130, "black"));

		for (Shapes shape : shapes) {
			shape.makeVisible();
		}
	}

}
