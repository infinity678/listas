package listastda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ListaSimple listaS = new ListaSimple();
        ListaCircular listaC = new ListaCircular();

        int[] datos = {3, 5, 2, 5, 7, 8};
        for (int dato : datos) {
            listaS.agregar(dato);
            listaC.agregar(dato);
        }

        ListaDoble listaD = new ListaDoble();
        for (int d : listaS.obtenerElementos()) listaD.agregar(d);
        for (int d : listaC.obtenerElementos()) listaD.agregar(d);

        listaD.ordenarYEliminarDuplicados();
        int[] elementos = listaD.obtenerElementos();
        System.out.print("Lista doble ordenada sin duplicados: ");
        for (int e : elementos) System.out.print(e + " ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número límite para filtrar primos: ");
        int limite = sc.nextInt();

        System.out.print("Primos hasta " + limite + ": ");
        for (int e : elementos) {
            if (Utilidades.esPrimo(e) && e <= limite) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }
}
