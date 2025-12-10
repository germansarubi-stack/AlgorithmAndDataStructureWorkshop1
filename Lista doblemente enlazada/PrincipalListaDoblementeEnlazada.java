
//Clase principal de la lista doblemente enlazada
public class PrincipalListaDoblementeEnlazada {
	public static void main(String[] args) {
		
		//Objeto de la clase lista doblemente enlazada
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        //Insertamos productos a la lista dentro de un capturador de error para que el programa
        //no finalize forzozamente y no inserte el producto en la lista
        try {
            lista.insertarOrdenado(new Producto(102, "Notebook", 900000.00));
            lista.insertarOrdenado(new Producto(101, "Teclado", 50000.00));
            lista.insertarOrdenado(new Producto(104, "Mouse", 25000.00));
            lista.insertarOrdenado(new Producto(103, "Monitor", 150000.00));
            lista.insertarOrdenado(new Producto(105, "Impresora", 350000.00));
            
            //Intento de insertar un producto con código duplicado
            lista.insertarOrdenado(new Producto(102, "Tablet", 500000.00));
            
        //Captura de error
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //listamos los productos para ver su resultado
        lista.listarProductos();
    }
	
}
