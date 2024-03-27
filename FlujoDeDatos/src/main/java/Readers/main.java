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
		
		ps.println("ASCII el char 3:" + texto.charAt(3) );
		ps.println("sin espacio:" + texto.trim() );
		ps.println("el esta en la posicion :" + texto.indexOf("el") );
		ps.println("el > esta en la posicion:" + texto.indexOf('<') );
		
		ps.println("ultima aparicion de la letra e" + texto.lastIndexOf('e'));
		ps.println("largo del texto" + texto.length());
		
		//compara si tiene el texto y revisa si la variable es exactamente igual (objeto completo)
		ps.println("" + texto.equals(""));
		
		//compara si tiene el texto (solo el contenido)
		ps.println("" + texto.compareTo("hola"));
		
		//devuelve true o false si lo que escribí esta en el texto
		ps.println("" + texto.contains("que"));
		
		//reemplaza solo pa primera aparicion de un caracter por otro
		ps.println("" + texto.replace("a","4"));
		
		//reemplaza todas las  apariciones de un caracter por otro
		ps.println("" + texto.replaceAll("a","4"));
		
		ps.println("" + texto.concat("otro texto").concat("otro texto"));
		
		ps.println("" + texto.toLowerCase());
		ps.println("" + texto.toUpperCase());
		
		
		ps.println("el texto empieza con Este:" + texto.startsWith("Este"));
		ps.println("el texto termina con ." + texto.endsWith("."));
		
		//estraer una parte de un texto desde la posicion que escribo
		ps.println("" + texto.substring(10));
		
		//apartir de la posicin que escribo primero, le escribo cuantas posiciones agarrar
		ps.println("" + texto.substring(10,8));
		
		//estraer una parte de un texto desde la posicion que escribo hasta la posicion donde estan esos caracterres
		ps.println("" + texto.substring(0, texto.indexOf("<>")));
		
		//retorna el caracter que esta en la posicion escrita en unicode 
		ps.println("UNICODE (E): " + texto.codePointAt(4));
		
		//cadena de caracteres en vector de caracteres
		char[] letraAletra = texto.toCharArray();
		
		//
		String separar = "esto, es un texto, que vamos, a separar.";
		String[] vec = separar.split(","); //["esto" , " es un texto" , " que vamos" , " a separar."]
		separar.split("\\+"); // es como \n \+
		texto.split(" <> ");
		
		
		
	}

}
