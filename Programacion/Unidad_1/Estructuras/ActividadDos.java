package Estructuras;

import java.util.Scanner;

public class ActividadDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero");
        float userNumber = scanner.nextFloat();

        boolean isWhole = (userNumber == (int) userNumber);
        boolean isPositive = (userNumber > 0);

        if (isWhole && isPositive) {
            System.out.println(userNumber + " es positivo y es entero");
        } else if (!isWhole && isPositive) {
            System.out.println(userNumber + " es positivo y no es entero");
        } else if (isWhole && !isPositive) {
            System.out.println(userNumber + " no es positivo y es entero");
        } else if (!isWhole && !isPositive) {
            System.out.println(userNumber + " no es positivo ni es entero");
        }

        scanner.close();
    }
}