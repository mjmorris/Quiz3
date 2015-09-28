
public class Triangle extends GeometricObject {
	
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	/** No Arg Constructor
	 * Creates a default Triangle
	 */
	public Triangle() {
		
	}
	
	/** Constructor that creates a Triangle with arguments:
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/** Returns side1 */
	public double getside1() {
		return side1;
	}
	
	/** Returns side2 */
	public double getside2() {
		return side2;
	}
	
	/** Returns side3 */
	public double getside3() {
		return side3;
	}

	/**
	 * Returns the area of the triangle with sides 1, 2, and 3
	 * according to Heron's formula:
	 * x = (side1 + side2 + side3) / 2
	 * Area = Square root of (x*(x-side1)*(x-side2)*(x-side3))
	 */
	public double getArea() {
		double x = (side1 + side2 + side3) / 2;
		return Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
	}
	
	/**
	 * Returns the perimeter of the triangle with sides 1, 2, and 3
	 * by adding the length of the three sides of the triangle
	 */
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	/**
	 * Returns a string description for the triangle
	 */
	public String toString() {
		return "Triangle's side 1 = " + side1 + ", side 2 = " + side2 +
				", side 3 = " + side3;
	}
}
