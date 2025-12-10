

	//Nombre: Sarubi German
	//Legajo: VINF013126
	//DNI: 36651460

//Clase principal del programa
public class MainOrdenarEquipo {
	public static void main(String[] args) {
		//Creamos un array y en cada espacio del mismo ingresamos un nodo con datos de los equipos
		Equipo[] equipos = {
	            new Equipo("Alte. Brown (M)", 15),
	            new Equipo("Atenas (RC)", 12),
	            new Equipo("Las Palmas(C)", 6),
	            new Equipo("Racing (C)", 18),
	            new Equipo("Alumni(VM)", 10),
	            new Equipo("Tiro Federal", 11)
	        };
		//Mostramos la tabla original
        System.out.println("Tabla de posiciones antes del ordenamiento:");
        quickSortTP4.mostrarEquipos(equipos);
        
        //Llamamos al metodo de ordenar 
        quickSortTP4.ordenar(equipos, 0, equipos.length - 1);

        //Mostramos la tabla despues del ordenamineto
        System.out.println("\nTabla de posiciones después del ordenamiento:");
        quickSortTP4.mostrarEquipos(equipos);
    }	
}
