import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	Triangle testTriangle;

	@Test
	public void testPerimeter() {
		testTriangle = new Triangle(5,4,3);
		testTriangle.getPerimeter();
		assertTrue(testTriangle.getPerimeter() == 12);
		assertTrue(testTriangle.getArea() == 6);
	}
	

}
