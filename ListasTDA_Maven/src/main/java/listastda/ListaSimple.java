package listastda;

public class ListaSimple {
    NodoSimple cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void agregar(int dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoSimple actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public int[] obtenerElementos() {
        int[] temp = new int[100]; // tamaño fijo para ejemplo
        int i = 0;
        NodoSimple actual = cabeza;
        while (actual != null) {
            temp[i++] = actual.dato;
            actual = actual.siguiente;
        }
        int[] resultado = new int[i];
        System.arraycopy(temp, 0, resultado, 0, i);
        return resultado;
    }
}
