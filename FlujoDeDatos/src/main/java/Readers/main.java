package Readers;

import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lectura lec = new Lectura();
		
		//lec.entradaDeDatos();
		
		//String leido = lec.entradaDeDatos();
		
		PrintStream ps = new PrintStream(System.out);
		
		String texto = "   Este va a ser el, texto <> que yo quiero, manipular";
		
		ps.println("El char 3:" + texto.charAt(3) );
		ps.println("sin espacio:" + texto.trim() );
		ps.println("el esta en la posicion :" + texto.indexOf("el") );
		ps.println("el > esta en la posicion:" + texto.indexOf('<') );
		
		
	}

}
