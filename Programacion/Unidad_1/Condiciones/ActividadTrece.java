import java.util.Scanner;

public class ActividadTrece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número para su arbolito:");
        int userNumber = scanner.nextInt();
        String leaf = "*";

        for (int i = 0; i < userNumber; i++) {
            System.out.println(leaf);
            leaf += "*";
        }

        for (int i = 1; i <= userNumber; i++) {
            // Imprimir espacios en blanco para centrar los asteriscos
            for (int j = 1; j <= userNumber - i; j++) {
                System.out.print(" ");
            }

            // Imprimir los asteriscos para la fila correspondiente
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Salto de línea después de imprimir cada nivel del árbol
            System.out.println();
        }

        scanner.close();
    }
}
