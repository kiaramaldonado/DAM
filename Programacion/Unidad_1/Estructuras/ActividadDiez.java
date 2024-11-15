package Estructuras;

import java.util.Scanner;

public class ActividadDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        int userNumberTwo;
        int multiply;

        do {
            System.out.println("Introduce un número:");
            userNumber = scanner.nextInt();

            System.out.println("Introduce otro número:");
            userNumberTwo = scanner.nextInt();

            multiply = (userNumber * userNumberTwo);

            System.out.println(userNumber + " x " + userNumberTwo + " = " + multiply);
        } while (multiply < 100 && userNumber != -1 && userNumberTwo != -1);

        System.out.println("finito");

        scanner.close();
    }
}