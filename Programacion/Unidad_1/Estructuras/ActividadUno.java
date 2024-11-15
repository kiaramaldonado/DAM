package Estructuras;

import java.util.Scanner;

public class ActividadUno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int userNumber = scanner.nextInt();

        if (userNumber > 10) {
            System.out.println(userNumber + " es mayor que 10");
        } else if (userNumber < 10) {
            System.out.println(userNumber + " es menor que 10");
        } else {
            System.out.println(userNumber + " es igual que 10");
        }

        scanner.close();
    }
}