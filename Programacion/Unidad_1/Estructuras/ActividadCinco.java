package Estructuras;

import java.util.Scanner;

public class ActividadCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangeLimitOne = 22;
        int rangeLimitTwo = 222;

        System.out.println("Introduzca un número");
        int userNumber = scanner.nextInt();

        boolean limitOk = userNumber >= rangeLimitOne && userNumber <= rangeLimitTwo;

        if (limitOk) {
            System.out.println("OK");
        } else {
            System.out.println("NO OK");
        }

        scanner.close();
    }
}