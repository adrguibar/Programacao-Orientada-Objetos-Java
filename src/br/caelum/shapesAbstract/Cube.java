package br.caelum.shapesAbstract;

public class Cube extends ThreeDimensionalShape {
		private double aresta;
		
	public Cube(double aresta) {
		this.aresta = validateAresta(aresta);
	}
	
	public void setAresta(double aresta) {
		this.aresta = validateAresta(aresta);
	}
	
	private double validateAresta(double aresta) {
		if (aresta <= 0) {
			throw new IllegalArgumentException("Aresta value must be > 0");
		}
		return aresta;
	}
	
	public double getAresta() {
		return aresta;
	}
	
	@Override
	public double getArea() {
		return 6 * Math.pow(aresta, 2);
	}

	@Override
	public double getVolume() {
		return Math.pow(aresta, 3);
	}

	@Override
	public String toString() {
		return String.format("Cube %nAresta: %,.2f", 
				this.getAresta());
	}

}
