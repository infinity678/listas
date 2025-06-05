package listastda;

public class ListaCircular {
    NodoCircular ultimo;

    public ListaCircular() {
        ultimo = null;
    }

    public void agregar(int dato) {
        NodoCircular nuevo = new NodoCircular(dato);
        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public int[] obtenerElementos() {
        int[] temp = new int[100];
        int i = 0;
        if (ultimo == null) return new int[0];
        NodoCircular actual = ultimo.siguiente;
        do {
            temp[i++] = actual.dato;
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
        int[] resultado = new int[i];
        System.arraycopy(temp, 0, resultado, 0, i);
        return resultado;
    }
}
