
//CLase lista doblemente enlazada que contendra los metdos de manipulacion de datos de la clase
public class ListaDoblementeEnlazada {
	private NodoDeListaDoblementeEnlazada cabeza;
    private NodoDeListaDoblementeEnlazada cola;

    //Constructor de la clase
    //Por defecto, en la lista vacia ambos punteros apuntan al nodo null
    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    //Metodo para insertar un nuevo producto ordenado de menor a mayor segun su atributo codigo
    public void insertarOrdenado(Producto producto) throws Exception {
    	NodoDeListaDoblementeEnlazada nuevoNodo = new NodoDeListaDoblementeEnlazada(producto);
    	
    	//Condicional de lista vacia, en caso de ser positivo solo se inserta el nuevo nodo
    	//y los punteros apuntan ambos al mismo nodo
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            
        //En caso de no estar vacia se lo inserta ordenado
        } else {
        	//Variables para posicionar el nodo
        	NodoDeListaDoblementeEnlazada actual = cabeza;
        	NodoDeListaDoblementeEnlazada anterior = null;
        	
        	//Recorrido de la lista para posicionar el nuevo nodo de menor a mayor
            while (actual != null && actual.producto.codigo < producto.codigo) {
                anterior = actual;
                actual = actual.siguiente;
            }
            
            //Condicional en caso de encontrar el codigo igual, capturamos el error
            //y emitimos mensaje por pantalla
            if (actual != null && actual.producto.codigo == producto.codigo) {
                throw new Exception("Código duplicado: " + producto.codigo);
            }

            
            if (anterior == null) {
                //Insertar al principio
                nuevoNodo.siguiente = cabeza;
                cabeza.anterior = nuevoNodo;
                cabeza = nuevoNodo;
            } else {
                //Insertar en el medio o al final
                nuevoNodo.siguiente = anterior.siguiente;
                nuevoNodo.anterior = anterior;
                //Condicional, de ser positivo el nuevo nodo es insertado entre dos nodos
                if (anterior.siguiente != null) {
                    anterior.siguiente.anterior = nuevoNodo;
                    
                //Sino lo inserta en la cola de la lista
                } else {
                    cola = nuevoNodo;
                }
                anterior.siguiente = nuevoNodo;
            }
        }
    }

    // Método para listar todos los productos
    public void listarProductos() {
        NodoDeListaDoblementeEnlazada actual = cabeza;
        
        //Recorrido de la lista
        while (actual != null) {
            System.out.println(actual.producto);
            actual = actual.siguiente;
        }
    }
}
