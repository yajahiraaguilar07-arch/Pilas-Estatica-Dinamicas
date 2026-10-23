public class PilaSimple {
    private final int[] datos;
    private int tope;

    public PilaSimple(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException(
                "La capacidad debe ser mayor que cero."
            );
        }

        datos = new int[capacidad];
        tope = -1;
    }

    // Inserta un elemento en la cima.
    public void push(int valor) {
        if (isFull()) {
            System.out.println("La pila estatica esta llena.");
            return;
        }

        datos[++tope] = valor;
    }

    // Extrae y devuelve el elemento de la cima.
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia.");
            return -1;
        }

        return datos[tope--];
    }

    // Muestra los elementos desde la cima.
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia.");
            return;
        }

        System.out.println("Pila estatica (cima a base):");
        for (int i = tope; i >= 0; i--) {
            System.out.println(datos[i]);
        }
    }

    // Comprueba si la pila esta vacia.
    public boolean isEmpty() {
        return tope == -1;
    }

    // Comprueba si el arreglo alcanzo su limite.
    public boolean isFull() {
        return tope == datos.length - 1;
    }

    // Consulta la cima sin eliminarla.
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia.");
            return -1;
        }

        return datos[tope];
    }
}
