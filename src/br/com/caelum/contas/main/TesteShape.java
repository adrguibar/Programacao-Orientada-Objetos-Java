package br.com.caelum.contas.main;
import br.caelum.shapesAbstract.Circle;
import br.caelum.shapesAbstract.Cube;
import br.caelum.shapesAbstract.Shape;
import br.caelum.shapesAbstract.TwoDimensionalShape;
import br.caelum.shapesAbstract.ThreeDimensionalShape;

public class TesteShape {
	public static void main(String[] args) {
		Circle circle = new Circle(3.4);
		Cube cube = new Cube(7.4);
		
		Shape vetor [] = new Shape[2];
		vetor[0] = circle;
		vetor[1] = cube;
		
		for (Shape shape : vetor) {
			System.out.printf("%n");
			System.out.println(shape);
			if (shape instanceof TwoDimensionalShape) {
				TwoDimensionalShape twoD = (TwoDimensionalShape) shape;
				System.out.printf("%nTwo Dimensional Shape %nArea: %,.2f %n",
						twoD.getArea());
			} else {
				ThreeDimensionalShape threeD = (ThreeDimensionalShape) shape;
				System.out.printf("%nThree Dimensional Shape %nArea: %,.2f %nVolume: %,.2f",
						threeD.getArea(), threeD.getVolume());
			}
			
		}
	}
}
