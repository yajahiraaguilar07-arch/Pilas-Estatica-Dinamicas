public class PilaDinamica {

    private static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    private Nodo cima;

    public PilaDinamica() {
        cima = null;
    }

    // Inserta un elemento en la cima.
    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    // Extrae el elemento de la cima.
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia.");
            return -1;
        }

        int valor = cima.dato;
        cima = cima.siguiente;
        return valor;
    }

    // Muestra los elementos de la pila.
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia.");
            return;
        }

        Nodo actual = cima;
        System.out.println("Pila dinamica:");

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Comprueba si la pila esta vacia.
    public boolean isEmpty() {
        return cima == null;
    }

    // Consulta el elemento superior sin eliminarlo.
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia.");
            return -1;
        }

        return cima.dato;
    }
}
