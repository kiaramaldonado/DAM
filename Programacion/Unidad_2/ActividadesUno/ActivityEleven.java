import java.util.Scanner;

public class ActivityEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int userNumber = scanner.nextInt();

        // Contamos columnas
        for (int index = 0; index < userNumber; index++) {
            // Contamos filas
            for (int i = 0; i < userNumber; i++) {
                // Entero random
                int randomInt = (int) (Math.random() * 10);
                // Imprimimos
                System.out.print("| " + randomInt + " |");
            }
            // Salto de linea al final de la fila
            System.out.println();
        }

        scanner.close();
    }
}