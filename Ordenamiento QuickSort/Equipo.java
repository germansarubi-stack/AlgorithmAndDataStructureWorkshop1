

	//Nombre: Sarubi German
	//Legajo: VINF013126
	//DNI: 36651460

//Clase donde se le asignara nombre y puntaje a cada equipo ingresado en un array
public class Equipo {
	private String nombre;
    private int puntaje;

    //Contructor de la clase
    public Equipo(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    //Funcion que devuelve los datos de la clase equipo cuando se lo llame
    @Override
    public String toString() {
        return"Equipo: "+ nombre + ": " + puntaje + " Pts";
    }
}
