
//Clase QuiokSort que contiene metodos de ordenamiento recursivo y particionamiento
public class quickSortTP4 {
	
	//Metodo de ordneamiento recursivo que recibe el array, 
	//el comeinzo y el final del mismo como parametro
	public static void ordenar(Equipo[] equipos, int bajo, int alto) {
		
		//condicional para terminar el llamado recursivo
        if (bajo < alto) {
        	
        	//ParticionEquipos es la partición del índice que es
			//ahora en su posición correcta 
            int particionEquipos = particionar(equipos, bajo, alto);
            //llamamos los elementos menores y mayores de la particion para que se ordenen
	        //recursivamente
            ordenar(equipos, bajo, particionEquipos - 1);
            ordenar(equipos, particionEquipos + 1, alto);
        }
    }

	//Esta función toma el último elemento como pivote,
	// coloca el elemento pivote en su posición correcta en la matriz
	//ordenada
	// y coloca todos los elementos más pequeños (más pequeños que pivote)
	// a la izquierda del pivote y todos los elementos mayores a la derecha
	//del pivote.
    private static int particionar(Equipo[] equipos, int bajo, int alto) {
        Equipo pivote = equipos[alto];
        int i = (bajo - 1);// índice del elemento mas chico

        for (int j = bajo; j < alto; j++) {
            if (equipos[j].getPuntaje() > pivote.getPuntaje()) {
                i++;
                intercambiar(equipos, i, j);
            }
        }
        intercambiar(equipos, i + 1, alto);
        return i + 1;
    }

    //Metodo para relizar el swap de elementos 
    private static void intercambiar(Equipo[] equipos, int i, int j) {
        Equipo temporal = equipos[i];
        equipos[i] = equipos[j];
        equipos[j] = temporal;
    }
    
  //Metodo para motrar el arreglo de la clase Equipo
    public static void mostrarEquipos(Equipo[] equipos) {
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }
}
