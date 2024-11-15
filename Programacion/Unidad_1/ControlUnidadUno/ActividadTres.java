import java.util.Scanner;

public class ActividadTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos un número entero al usuario
        System.out.println("Introduzca un número entero: ");
        int userNumber = scanner.nextInt();

        // Declaramos e inicializamos los números que se sumarán en el bucle for
        int sumNumber = 0;
        // Declaramos e inicializamos también la cadena de texto para la legibilidad
        String cadena = "";

        // Iniciamos bucle, sumando 2 desde 0 para ignorar los impares
        for (int i = 0; i <= userNumber; i += 2) {
            sumNumber += i;
            if (i != 0) {
                // Al primer número (0) no nos interesa poner '+' antes
                cadena += " + " + i;
            } else {
                cadena += i;
            }
        }

        // Mostramos el resultado
        System.out
                .println("La suma de todos los números pares antes de este número es:\n" + cadena + " = " + sumNumber);
        scanner.close();
    }
}