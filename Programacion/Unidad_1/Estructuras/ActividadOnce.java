package Estructuras;

import java.util.Scanner;

public class ActividadOnce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int userNumber = scanner.nextInt();

        int factorial = 1;
        String cadena = "";

        for (int i = 1; i <= userNumber; i++) {
            factorial *= i;
            if (i != 1) {
                cadena += " x " + i;
            } else {
                cadena += i;
            }
        }

        System.out.println(cadena + " = " + factorial);
        scanner.close();
    }
}