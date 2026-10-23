public class Main {

    public static void main(String[] args) {

        System.out.println("PILAS ESTATICAS Y DINAMICAS");
        System.out.println("Practica de Estructura de Datos\n");

        // Prueba de la pila estatica.
        PilaSimple estatica = new PilaSimple(3);

        System.out.println("--- PILA ESTATICA ---");
        estatica.push(10);
        estatica.push(20);
        estatica.push(30);
        estatica.push(40);

        estatica.mostrar();

        System.out.println("Cima: " + estatica.peek());
        System.out.println("Extraido: " + estatica.pop());

        estatica.mostrar();

        System.out.println("Esta vacia: " + estatica.isEmpty());
        System.out.println("Esta llena: " + estatica.isFull());

        // Prueba de la pila dinamica.
        PilaDinamica dinamica = new PilaDinamica();

        System.out.println("\n--- PILA DINAMICA ---");
        dinamica.push(100);
        dinamica.push(200);
        dinamica.push(300);

        dinamica.mostrar();

        System.out.println("Cima: " + dinamica.peek());
        System.out.println("Extraido: " + dinamica.pop());

        dinamica.mostrar();

        System.out.println("Esta vacia: " + dinamica.isEmpty());
    }
}
