public class CartasJuego {
    public static void main(String[] args) {
        inicializarCartasJuego();
    }
    public static String[][] crearMatrizCartas() {
        String[][] matrizDeCartas = new String [12][2];
        return matrizDeCartas;
    }
    public static String agregarCartas(String nombreCarta, String puntaje) {
        crearMatrizCartas()[0][0] = nombreCarta;
        crearMatrizCartas()[0][1] = puntaje;
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
    public static void salir() {}
    public static void menu() {}

}