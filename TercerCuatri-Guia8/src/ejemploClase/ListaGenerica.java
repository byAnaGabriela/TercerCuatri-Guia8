package ejemploClase;

public class ListaGenerica<T> { //Representacion primitiva de lo que hace arraylist
    private T[] elementos;
    private int tamañoActual;

    @SuppressWarnings("unchecked")
    public ListaGenerica(int tamaño) {
        elementos = (T[]) new Object[tamaño];
        tamañoActual = 0;
    }

    public void agregar(T elemento) {
        // Si la lista está llena, lanzamos una excepción
        if (tamañoActual == elementos.length) {
            System.out.println("Lista llena no se pueden agregar mas elementos");
        }else {
            // Agregamos el elemento al final de la lista
            elementos[tamañoActual] = elemento;
            tamañoActual++;
        }
    }

    public T obtener(int indice) {
        // código para obtener un elemento de la lista
        T resultado = elementos[indice];
        tamañoActual = indice;
        return resultado;
    }

    //El caracter especial de tipo T (puede ser cualquier otra letra/palabra) Hago referencia a que no especifico el
    // tipo de dato le estoy diciendo a la jbm que puede aceptar cualquier tipo (perros, elefantes, vehiculos, cuentas).
    // Ignora la implementación interna de eso, si o si trabaja con la referancia que te dicen desde arriba

    // Cuando invocamos una clase de lista generica, un arraylist, lista linkeada, vamos a estar trabajanmdo en
    // estructuras genericas en las cuales detenemos tipos abstractos, tipos genericos, tipos que son letras

}
