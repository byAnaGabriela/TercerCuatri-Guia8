package uno;

import java.util.List;

public class MiLista<T>{ /*lista es una coleccion para almacenar estructuras de tipo vectoriall/lineal sin embargo con
este formato(generico) puedo hacer un monton de cosas entre las capas intermedias, por ejemplo antes de llegar a agregar
una lista, por ejemplo, si quiero ordenar los valores antes de agregarlos, si quiero que todos los valores sean pares,
si quiero extender el modelo esa es la ventaja de trabajar con generics*/

    private List<T> miLista;

    public MiLista (List<T> miLista){
        super();
        this.miLista = miLista;
    }

    public void agregar(T t){
        this.miLista.add(t);
    }

    public void agregarTodos(List<T> collection){
        this.miLista.addAll(collection); //Esto es si quiero agregar una lista a otra lista
    }

    public T obtener(Integer index){
        return this.miLista.get(index);
    }

}
