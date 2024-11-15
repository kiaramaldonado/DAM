import java.util.Scanner;

public class ActividadDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero");
        float userNumber = scanner.nextFloat();

        boolean isPositive = userNumber > 0;
        boolean isWhole = (userNumber == (int) userNumber);

        // if (isPositive && isWhole) {
        // System.out.println(userNumber + " es positivo y entero.");
        // } else if (!isPositive && isWhole) {
        // System.out.println(userNumber + " es negativo y entero.");
        // } else if (isPositive && !isWhole) {
        // System.out.println(userNumber + " es positivo, pero no entero.");
        // } else if (!isPositive && !isWhole) {
        // System.out.println(userNumber + " es negativo y no es entero.");
        // } else {
        // System.out.println("KHEEEEE");
        // }

        String mensaje = userNumber + " es " +
                (isPositive ? "positivo" : "negativo") +
                " y " +
                (isWhole ? "entero." : "no entero.");

        System.out.println(mensaje);

        scanner.close();
    }
}
