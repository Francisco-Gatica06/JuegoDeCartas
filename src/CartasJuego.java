import java.util.Scanner;
import java.util.Random;

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
                crearMatrizCartas()[1][j] = puntaje;
            }
        }
    }
    public static void inicializarCartasJuego(int fila, int columna) {
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
    public static void obtenerCartas() {
        Random aleatorio = new Random();
        System.out.println(1+aleatorio.nextInt( (9+1) - 1));

    }
    public static void jugar() {}
    public static void salir() {
        System.exit(0);
    }
    public static void menu() {
        while (true) {
            System.out.println("Bienvenido al blackjack de Francisco.");
            System.out.println("1 = Jugar");
            System.out.println("2 = Salir");
            Scanner lectura = new Scanner(System.in);
            System.out.print("Escoja una opcion: ");
            String input = lectura.next();
            if (input == "1") {
                jugar();
            } else if (input == "2") {
                System.out.println("Programa finalizado");
                salir();
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }

}