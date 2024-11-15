import java.util.Scanner;

public class ActivityFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] userNumbers = new int[5];

        // Pedir 5 números
        for (int index = 0; index < 5; index++) {
            System.out.print((index + 1) + ". DAME UN NÚMERO: ");
            userNumbers[index] = scanner.nextInt();
        }

        int max = userNumbers[0];
        int min = userNumbers[0];

        // Recorrer el arreglo para encontrar el número mayor y el menor
        for (int userNumber : userNumbers) {
            if (userNumber > max) {
                max = userNumber; // Actualizar el número mayor
            }
            if (userNumber < min) {
                min = userNumber; // Actualizar el número menor
            }
        }

        // Mostrar el número mayor y menor
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);

        scanner.close();
    }
}