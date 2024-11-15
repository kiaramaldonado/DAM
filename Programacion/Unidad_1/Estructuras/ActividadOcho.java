package Estructuras;

import java.util.Scanner;
import java.util.Random;

public class ActividadOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduzca un número entero:");
        int userNumber = scanner.nextInt();

        System.out.println("Introduzca otro número entero:");
        int userNumberTwo = scanner.nextInt();

        System.out.println("Introduzca otro número entero:");
        int userNumberThree = scanner.nextInt();

        int loteria = 0;

        for (int i = 0; i < 1; i++) {
            loteria = random.nextInt(10) + 1;
        }

        boolean win = (loteria == userNumber || loteria == userNumberTwo || loteria == userNumberThree);

        if (win) {
            System.out.println("WIN : " + loteria);
        } else {
            System.out.println("LOST : " + loteria);
        }

        scanner.close();
    }
}