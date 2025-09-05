package br.com.caelum.shapes;

public class Retangulo extends Quadrilatero {
	public Retangulo(Point p1, Point p2, Point p3, Point p4){
		super(p1, p2, p3, p4);
	}
	
	public double getArea() {
		double base = getDistancia(getP1(), getP2());
		double altura = getDistancia(getP3(), getP4());
		
		return base * altura;
	}
	
	private double getDistancia(Point a, Point b) {
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}
}
