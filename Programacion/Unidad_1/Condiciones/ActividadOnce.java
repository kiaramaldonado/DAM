import java.util.Scanner;

public class ActividadOnce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int userNumber = scanner.nextInt();
        int multNumber = 1;
        String cadena = "";

        for (int i = 1; i <= userNumber; i++) {
            multNumber *= i;

            if (i != 1) {
                cadena += " x " + i;
            } else {
                cadena += i;
            }
        }

        System.out.println(userNumber + "! = " + cadena + " = " + multNumber);

        scanner.close();
    }

}