package Estructuras;

import java.util.Scanner;

public class ActividadTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int userNumber = scanner.nextInt();

        boolean isEven = (userNumber % 2 == 0);
        boolean isMultipleOfFive = (userNumber % 5 == 0);

        if (isEven) {
            System.out.println("El número " + userNumber + " es par.");
        } else if (!isEven && isMultipleOfFive) {
            System.out.println("Es impar y múltiplo de 5");
        }

        scanner.close();
    }
}