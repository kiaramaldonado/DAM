package Estructuras;

import java.util.Scanner;

public class ActividadSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;

        do {
            System.out.println("Introduzca un número entero: ");
            userNumber = scanner.nextInt();

            switch (userNumber) {
                case 1:
                    System.out.println("El día " + userNumber + " de la semana es Lunes");
                    break;
                case 2:
                    System.out.println("El día " + userNumber + " de la semana es Martes");
                    break;
                case 3:
                    System.out.println("El día " + userNumber + " de la semana es Miércoles");
                    break;
                case 4:
                    System.out.println("El día " + userNumber + " de la semana es Jueves");
                    break;
                case 5:
                    System.out.println("El día " + userNumber + " de la semana es Viernes");
                    break;
                case 6:
                    System.out.println("El día " + userNumber + " de la semana es Sábado");
                    break;
                case 7:
                    System.out.println("El día " + userNumber + " de la semana es Domingo");
                    break;
                default:
                    System.out.println("Nada que verchhhh");
                    break;
            }
        } while (userNumber != 0);

        scanner.close();
    }
}