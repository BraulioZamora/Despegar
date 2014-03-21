package figuras;

public class Triangle extends Figure{
	private Double side1;
	private Double side2;
	private Double side3;
	public Triangle(Double side1, Double side2, Double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.type = "T";
	}
	public Double perimeter(){
		return  this.side1 + this.side2 + this.side3;
	}
	
	public Double area(){
		return (this.side1 * this.side2)/2;
	}
}
