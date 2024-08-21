import java.util.Scanner;

public class CartasJuego {
    public static void main(String[] args) {
        menu();
    }
    public static String[][] crearMatrizCartas() {
        String[][] matrizDeCartas = new String [12][2];
        return matrizDeCartas;
    }
    public static void agregarCartas(String nombreCarta, String puntaje) {
        for (int i = 0; i < crearMatrizCartas().length; i++) {
            for (int j = 0; j < crearMatrizCartas()[i].length; j++) {
                crearMatrizCartas()[i][0] = nombreCarta;
                crearMatrizCartas()[i][j] = puntaje;
            }
        }
    }
    public static void inicializarCartasJuego() {
        agregarCartas("A", "11");
        agregarCartas("Dos", "2");
        agregarCartas("Tres", "3");
        agregarCartas("Cuatro", "4");
        agregarCartas("Cinco", "5");
        agregarCartas("Seis", "6");
        agregarCartas("Siete", "7");
        agregarCartas("Ocho", "8");
        agregarCartas("Nueve", "9");
        agregarCartas("Diez", "10");
        agregarCartas("J", "10");
        agregarCartas("Q", "10");
        agregarCartas("K", "10");
    }
    public static void obtenerCartas() {}
    public static void jugar() {}
    public static void salir() {
        System.exit(0);
    }
    public static String leerDato() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escoja una opcion: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
    public static void menu() {
        while (true) {
            System.out.println("");
            System.out.println("1 = Obterner carta");
            System.out.println("2 = Jugar");
            System.out.println("3 = Salir");
            if (leerDato() == "1") {
                obtenerCartas();
            } else if (leerDato() == "2" ) {
                jugar();
            } else if (leerDato() == "3") {
                System.out.println("Programa finalizado");
                salir();
            }

        }
    }

}