package Actividad15;
/*
Definir una clase ListaOrdenada, que hereda de LinkedList,
que permita la inserción ordenada. Codificar un método que inserte un nuevo elemento con el prototipo:
void insertarOrdenado( E elemento)
 */
public class Main {
    public static void main(String[] args) {
        ListaOrdenada<Integer> myList = new ListaOrdenada<>();
        ListaOrdenada<String> myStringList = new ListaOrdenada<>();

        myList.insertarOrdenado(3);
        myList.insertarOrdenado(8);
        myList.insertarOrdenado(10);
        myList.insertarOrdenado(1);
        myList.insertarOrdenado(7);

        myStringList.insertarOrdenado("B");
        myStringList.insertarOrdenado("J");
        myStringList.insertarOrdenado("A");
        myStringList.insertarOrdenado("D");

        System.out.println(myList);
        System.out.println(myStringList);
    }
}
