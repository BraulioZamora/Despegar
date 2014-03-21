package figuras;

public class Square extends Figure {
	private Double side;

	public Square(Double side) {
		this.side = side;
		this.type = "S";
	}
	public Double perimeter(){
		return  4 * this.side ;
	}
	
	public Double area(){
		return this.side * this.side;
	}

}
