package figuras;

public abstract class Figure {
	protected  String type;
	public abstract Double area();
	public abstract Double perimeter();
	public String getType(){
		return this.type;
	}
	
	

}
