package Estructuras;

import java.util.Scanner;

public class ActividadSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int userNumber = scanner.nextInt();
        int multiple;

        for (int i = 1; i < 11; i++) {
            multiple = i;

            int result = multiple * userNumber;
            System.out.println(userNumber + " x " + multiple + " = " + result);
        }

        scanner.close();
    }
}