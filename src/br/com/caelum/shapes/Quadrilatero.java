package br.com.caelum.shapes;

public class Quadrilatero {
	private double x1, y1;
	private double x2, y2;
	private double x3, y3;
	private double x4, y4;
	
	Quadrilatero(Point p1, Point p2, Point p3, Point p4){
		this.x1 = p1.getX();
		this.x2 = p2.getY();
		this.x3 = p3.getX();
		this.x3 = p3.getY();
		this.x4 = p4.getX();
		this.x4 = p4.getY();
	}
	
    // Getters que retornam objetos Point
    public Point getP1() { return new Point(x1, y1); }
    public Point getP2() { return new Point(x2, y2); }
    public Point getP3() { return new Point(x3, y3); }
    public Point getP4() { return new Point(x4, y4); }
	
    public void setP1(Point p1) {
    	this.x1 = p1.getX();
    	this.y1 = p1.getY();
    }
    
    public void setP2(Point p2) {
    	this.x1 = p2.getX();
    	this.y1 = p2.getY();
    }
    
    public void setP3(Point p3) {
    	this.x1 = p3.getX();
    	this.y1 = p3.getY();
    }
    
    public void setP4(Point p4) {
    	this.x1 = p4.getX();
    	this.y1 = p4.getY();
    }
    
    @Override
    public String toString() {
        return String.format("%s: (%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f)",
        		getClass().getSimpleName(),
                x1, y1, x2, y2, x3, y3, x4, y4);
    }
}	