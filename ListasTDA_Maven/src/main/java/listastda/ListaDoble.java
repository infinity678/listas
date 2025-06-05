package listastda;

import java.util.TreeSet;

public class ListaDoble {
    NodoDoble cabeza, cola;

    public ListaDoble() {
        cabeza = cola = null;
    }

    public void agregar(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void ordenarYEliminarDuplicados() {
        TreeSet<Integer> conjunto = new TreeSet<>();
        NodoDoble actual = cabeza;
        while (actual != null) {
            conjunto.add(actual.dato);
            actual = actual.siguiente;
        }
        cabeza = cola = null;
        for (int dato : conjunto) {
            this.agregar(dato);
        }
    }

    public int[] obtenerElementos() {
        int[] temp = new int[100];
        int i = 0;
        NodoDoble actual = cabeza;
        while (actual != null) {
            temp[i++] = actual.dato;
            actual = actual.siguiente;
        }
        int[] resultado = new int[i];
        System.arraycopy(temp, 0, resultado, 0, i);
        return resultado;
    }
}
