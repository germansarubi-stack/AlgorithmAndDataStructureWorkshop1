

		//Nombre: German Sarubi
		//Legajo: VINF013126
		//DNI: 36651460

//Clase producto con sus caracteristicas
public class Producto {
	int codigo;
    String descripcion;
    double precio;
    
    //Construtor de la clase
    public Producto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
	
    //Metodo para devolver la descripcion de un producto o de los productos
    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio: " + precio;
    }
}
