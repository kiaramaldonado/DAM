import java.util.Scanner;

public class ActivityEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] userNumbers = new int[5];

        for (int index = 0; index < 5; index++) {
            System.out.print("Introduce un número: ");
            userNumbers[index] = scanner.nextInt();
        }

        // Variable booleana para determinar si el arreglo es capicúa
        boolean isPalindrome = true;

        // Ciclo para verificar si el arreglo es igual leído de adelante hacia atrás y
        // viceversa
        // Recorre solo hasta la mitad del arreglo (userNumbers.length / 2)
        for (int i = 0; i < userNumbers.length / 2; i++) {
            // Compara el elemento de la posición 'i' con el elemento de la posición opuesta
            // 'userNumbers.length - 1 - i' da la posición simétrica desde el final
            if (userNumbers[i] != userNumbers[userNumbers.length - 1 - i]) {
                // Si encuentra una diferencia, el arreglo no es capicúa
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Es capicúa.");
        } else {
            System.out.println("No es capicúa.");
        }

        scanner.close();
    }
}