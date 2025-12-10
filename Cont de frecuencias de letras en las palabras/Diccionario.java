	//Nombre: German Sarubi
	//Legajo: VINF013126
	//DNI: 36651460
	//Fecha:10/06/2024

import java.util.Scanner; 


public class Diccionario {
	
	//Metodo main de iniciacion de del programa
	public static void main(String[] args) {
		
		//Arreglo para almacenar palabras
		String[] palabras = new String[3]; 

		//Escaner para ingresar palabras por consola
	    Scanner teclado = new Scanner(System.in); 
	    
	    //Bucle para rellenar el arreglo
	    for (int i=0; i < palabras.length; i++) {
	    	System.out.print("Ingrese la palabra"+ (i+1) +"(por favor, sólo letras): "); 
	    	palabras[i] = teclado.nextLine(); 
	    }
	    
	    //Listado de palabras
        System.out.println("\nPalabras almacenadas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + ": " + palabras[i]);
        }
        
        //Seleccionar una posicion de palabra para ser contada
        System.out.print("\nIngrese el número de la palabra para contar la frecuencia de las letras: ");
        int valor = teclado.nextInt();
        

        //Condicional para validar la pocision de una palabra 
        if (valor < 1 || valor > palabras.length) {
            System.out.println("Índice fuera de rango.");
        } else {
        	//Varibale para guardar la palabra elegida para enviar como parametro para su conteo
            String palabraElegida = palabras[valor - 1];
            //Nuevo objeto para contar la frecuencia
            Conteo contar = new Conteo();
            //Variable arreglo para guardar el retorno del metodo conteoDeFrecuencia
            int[] conteos = contar.conteoDeFrecuencia(palabraElegida);

            //Imprimir frecuencias
            System.out.println("\nFrecuencias de las letras de la palabra '" + palabraElegida + "':");
            for (int i = 0; i < conteos.length; i++) {
                if (conteos[i] != 0) {
                    System.out.println((char) (i + 'A') + ": " + conteos[i]);
                }
            }
	}
}
}
