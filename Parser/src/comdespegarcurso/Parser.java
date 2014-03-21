package comdespegarcurso;

import java.util.Stack;

public class Parser {

	public static void main (String[] args)
	{
		Parser p = new Parser();
		boolean b = p.parse ("[(hola)]");
	}
	
	public boolean parse (String palabra)
	{
	 boolean checksentence= true;
	 Stack <Character> delimitadores;
	 char[] letras=palabra.toCharArray();
	 delimitadores = new Stack <Character>();
	 for(int i = 0 ; i<=letras.length; i++)
	    { if( letras[i] == '(')
	      {
		   delimitadores.push(letras[i]);
	      }
	      if( letras[i] == '[')
	      {
		   delimitadores.push(letras[i]);
	      }
	      if( letras[i] == '{')
	      {
		   delimitadores.push(letras[i]);
	       }
	       if(letras[i] == ')')
	       {
	    	if(letras[i] == delimitadores.lastElement())
	    	{
	    		delimitadores.pop();
	    	} 
	    	else
	    	{
	    		checksentence= false;
	    	}
		 
	       }
		 
	   }
		
		
	 return false;
    }
	
	
}
