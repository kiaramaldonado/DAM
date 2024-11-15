import java.util.Scanner;

public class ActividadCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entre 20 y 50:");
        int number = scanner.nextInt();

        int startNumber = 20;
        int endNumber = 50;

        boolean interval = (number >= startNumber) && (number <= endNumber);

        if (interval) {
            System.out.println("El número " + number + " pertenece a este intervalo");
        } else {
            System.out.println("Te pasaste brother");
        }

        // boolean startNumber = number > 20;
        // boolean endNumber = number < 50;

        // if (startNumber && endNumber) {
        // System.out.println("El número " + number + " pertenece a este intervalo");
        // } else if (startNumber && !endNumber) {
        // System.out.println("El número " + number + " es demasiado grande.");
        // } else if (!startNumber && endNumber) {
        // System.out.println("El número " + number + " es demasiado pequeño.");
        // }

        scanner.close();
    }
}
