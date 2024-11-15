package Estructuras;

import java.util.Scanner;
import java.util.Random;

public class ActividadNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tries = 1;
        int loteria = 0;
        boolean win;

        for (int i = 0; i < 1; i++) {
            loteria = random.nextInt(10) + 1;
        }

        do {
            System.out.println("Introduce un número enter 1 y 100: ");
            int userNumber = scanner.nextInt();

            win = (userNumber == loteria);

            if (win) {
                System.out.println("Ganaste");
            } else if (userNumber > loteria) {
                System.out.println("Más pequeño...");
                tries++;
                System.out.println("Intento: " + tries);
            } else {
                System.out.println("Más grande...");
                tries++;
                System.out.println("Intento: " + tries);
            }

        } while (tries < 11 || !win);

        scanner.close();
    }
}