package figuras;

import java.security.InvalidParameterException;

public class FigureFactory {
	static public void main (String[] args){
		if (args.length < 2){
		throw new InvalidParameterException("Nro parametros invalidos");	
		}
		Figure f = null;
		String FigType = args [0];
		if(FigType.equals("S")){
			f = new Square(Double.valueOf(args[1])); 
		} else if (FigType.equals("R")){
			f = new Rectangule(Double.valueOf(args[1]),Double.valueOf(args[2])); 
		} else if (FigType.equals("C")){
			f = new Circle(Double.valueOf(args[1])); 
		} else if (FigType.equals("T")){
			f = new Triangle(Double.valueOf(args[1]), Double.valueOf(args[2]),Double.valueOf(args[3])); 
		} 
		Double area = f.area();
		Double perimetro = f.perimeter();
		String FType = f.getType();
		System.out.println(area+ " "+ perimetro +" "+ FType);
	}

}
