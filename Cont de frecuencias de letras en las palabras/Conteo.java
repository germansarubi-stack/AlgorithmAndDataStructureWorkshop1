	//Nombre: German Sarubi
	//Legajo: VINF013126
	//DNI: 36651460
	//Fecha:10/06/2024


public class Conteo {
	//nueva clase de conteo de frecuencia
	
	//metodo de conteo que recibe un parametro y devuelve un array de enteros
	public int[] conteoDeFrecuencia(String palabra) {
		
		//Arreglo para almacenar el conteo de letras
        int[] conteos = new int[26]; 
        
        //Convertidor de mayusculas
        palabra = palabra.toUpperCase(); 
	
    //Bucle de conteo de frecuencia
	for (int i=0; i < palabra.length(); i++) {
		
	    	//Bloque que atrapa la excepcion
	    	try {
	    		conteos[palabra.charAt(i)-'A']++;
	    	}
	    	
	    	//Atrapa la excepcion generada y genera un mensaje por consola
	    	catch (ArrayIndexOutOfBoundsException e) {
	    		System.out.println("No es una letra: " + palabra.charAt(i) + " ("+"Fuera de limites"+")");
         }
	    }
	return conteos;
}
}
