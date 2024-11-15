import java.util.Scanner;
import java.util.Random;

public class ActivityThree {

    // Colores para estilizar
    /*
     * Se definen constantes para colores en la consola
     * que permiten destacar mensajes
     */
    public static final String ANSI_RED = "\u001B[31m"; // Rojo para mensajes de error
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m"; // Reset para volver al color por defecto

    // Lista de palabras
    /*
     * Array que almacena las palabras posibles del juego.
     * Funciona como banco de palabras que se seleccionan de forma aleatoria.
     */
    private static String[] words = { "clase", "objeto", "herencia", "polimorfismo", "método", "atributo", "interfaz",
            "sobrecarga", "sobreescritura", "constructor",
            "paquete", "excepción", "hilo", "síncrono",
            "asincrono", "compilador", "biblioteca", "framework", "colección", "genéricos", "stream", "serialización",
            "hashmap", "array",
            "cadena", "booleano", "primitivo",
            "final", "estático", "importar", "sincronización", "concurrencia", "reflexión", "archivo", "lector",
            "escritor" };

    // Almacena la palabra seleccionada al azar
    private static String selectedWord;

    // Número de intentos iniciales
    private static int attempts = 5;

    // Estado actual de la palabra adivinada
    /*
     * Array de caracteres que representa el progreso del jugador.
     * Inicialmente se llena con guiones bajos (_).
     */
    private static char[] progress;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Selecciona una palabra aleatoria
        selectRandomWord();

        // Variable para determinar si el juego ha terminado
        boolean gameOver = false;

        // Inicializa el progreso de la palabra con guiones bajos
        progress = new char[selectedWord.length()];
        for (int i = 0; i < progress.length; i++) {
            progress[i] = '_';
        }

        // Mensaje de bienvenida
        System.out.println(ANSI_GREEN + "Juguemos al Ahorcado" + ANSI_RESET);
        System.out.println("Tienes " + attempts + " intentos para ganar. ¡Suerte!");

        // Bucle principal
        while (!gameOver) {
            // Muestra el progreso de la palabra
            showWordProgress();

            // Dibuja el estado actual del stickman
            showStickman();

            // Solicita al jugador que introduzca una letra
            System.out.print("Introduce una letra: ");
            char guess = scanner.next().toLowerCase().charAt(0); // Lee la primera letra en minúscula

            // Verifica si la letra es correcta
            if (!checkLetter(guess)) {
                attempts--; // Reduce el número de intentos si es incorrecta
                System.out.println(ANSI_RED + "Incorrecto." + ANSI_RESET + " Te quedan " + attempts + " intentos.");
            }

            // Comprueba si el juego ha terminado
            gameOver = isGameOver();
        }

        // Mensaje final según el resultado
        if (attempts > 0) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + selectedWord);
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + selectedWord);
            showStickman(); // Dibuja el stickman completo al final
        }

        scanner.close(); // Cierra el recurso Scanner
    }

    // FUNCIÓN A: Elegir palabra aleatoria de la lista
    /*
     * Selecciona una palabra aleatoria del Array utilizando la clase Random.
     * Asigna la palabra seleccionada a la variable selectedWord.
     */
    private static void selectRandomWord() {
        Random random = new Random();
        selectedWord = words[random.nextInt(words.length)];
    }

    // PROCEDIMIENTO B: Muestra el progreso de la palabra con guiones
    /*
     * Imprime el progreso de la palabra, mostrando las letras adivinadas.
     */
    private static void showWordProgress() {
        System.out.print("Palabra: ");
        for (char c : progress) {
            System.out.print(c + " "); // Imprime cada carácter seguido de un espacio
        }
        System.out.println();
    }

    // FUNCIÓN C: Comprueba si la letra es correcta
    /*
     * Verifica si la letra introducida está en la palabra.
     * Actualiza el Array progress con la letra en su posición correspondiente
     * y retorna true si la letra es correcta, o false si no.
     */
    private static boolean checkLetter(char letter) {
        boolean correct = false;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (selectedWord.charAt(i) == letter) { // Comprueba si coincide
                progress[i] = letter; // Actualiza el progreso
                correct = true;
            }
        }
        return correct;
    }

    // PROCEDIMIENTO D: Dibujar stickman
    /*
     * Dibuja el estado actual del stickman según el número de intentos restantes.
     * Utiliza un switch para mostrar diferentes etapas del dibujo.
     */
    private static void showStickman() {
        switch (attempts) {
            case 5:
                System.out.println(" +---+");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 4:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 3:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 2:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 1:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("    ===");
                break;
            case 0:
                System.out.println(" +---+");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("    ===");
                break;
        }
    }

    // FUNCIÓN E: Finalizar
    /*
     * Determina si el juego ha terminado si:
     * - No quedan guiones bajos (_) en progress (GANAR).
     * - No quedan intentos (PERDER).
     */
    private static boolean isGameOver() {
        for (char c : progress) {
            if (c == '_') { // Si queda un guion, el juego no ha terminado
                return attempts <= 0; // El juego termina si los intentos llegan a 0
            }
        }
        return true; // El jugador ha adivinado toda la palabra
    }
}
