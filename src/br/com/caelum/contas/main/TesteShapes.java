package br.com.caelum.contas.main;
import br.com.caelum.shapes.Retangulo;
import br.com.caelum.shapes.Quadrado;
import br.com.caelum.shapes.Point;

public class TesteShapes {
	public static void main ( String args []) {
		
		Quadrado quadrado1 = new Quadrado(new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8));
		Retangulo retangulo1 = new Retangulo(new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8));
		
        System.out.println(quadrado1);
        System.out.println(retangulo1);
	}
}
