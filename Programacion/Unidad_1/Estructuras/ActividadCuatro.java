package Estructuras;

import java.util.Scanner;

public class ActividadCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su contraseña: ");
        String password = scanner.nextLine();

        boolean coincidence = password.equals("123abc");

        if (coincidence) {
            System.out.println("Indique una ciudad");
            String city = scanner.nextLine();
            System.out.println("Espiado sobre <" + city + ">...");
        }

        scanner.close();
    }
}