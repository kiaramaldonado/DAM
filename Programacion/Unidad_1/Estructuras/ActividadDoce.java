package Estructuras;

import java.util.Scanner;

public class ActividadDoce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un texto: ");
        String text = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " espacios");

        System.out.println(text.replaceAll(" ", "_"));

        System.out.println(text.replaceAll("[a, e, i, o, u]", " "));

        scanner.close();
    }
}