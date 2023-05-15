package Sample;

public class Circle {
	public double radius;
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2*Math.PI;
	}
	
	public double circumference() {
		return perimeter();
	}
}
