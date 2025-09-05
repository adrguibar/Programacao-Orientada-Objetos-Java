package br.caelum.shapesAbstract;

public class Circle extends TwoDimensionalShape {
	static double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		this.radius = validateRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = validateRadius(radius);
	}
	
	private double validateRadius(double radius) {
	    if (radius < 0) {
	        throw new IllegalArgumentException("Radius value must be >= 0");
	    }
	    return radius;
	}
	
	@Override
	public double getArea() {
		return PI * radius;
	}
	
	@Override
	public String toString() {

		return String.format("Circle %n%s: %,.2f", 
				"Radius", this.getRadius());
	}

}
