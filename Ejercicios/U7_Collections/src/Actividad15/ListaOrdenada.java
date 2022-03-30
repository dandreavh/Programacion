package Actividad15;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaOrdenada<E> extends LinkedList<E> {

    public void insertarOrdenado(E elemento){
        this.add(elemento);
        Collections.sort((List)this);
    }
}

