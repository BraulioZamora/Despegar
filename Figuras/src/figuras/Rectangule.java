package figuras;

public class Rectangule extends Figure {
	private Double side1;
	private Double side2;
	public Rectangule(Double side1, Double side2) {
		this.side1 = side1;
		this.side2 = side2;
		this.type = "R";
	}
	public Double perimeter(){
		return  (this.side1 + this.side2)*2;
	}
	
	public Double area(){
		return this.side1 * this.side2;
	}
}
