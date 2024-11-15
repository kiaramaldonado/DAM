import java.util.Scanner;

public class ActividadUno {

    public static boolean isPositive(int userNumber) {
        return userNumber > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Introduce un número entero para ver si es positivo o negativo:");
            int userNumber = scanner.nextInt();

            boolean positive = isPositive(userNumber);

            if (positive) {
                System.out.println(userNumber + " es positivo.");
            } else {
                System.out.println(userNumber + " es negativo.");
            }

            System.out.println("¿Quieres verificar otro número? (s/n):");
            String answer = scanner.next();

            if (answer.equals("n") || answer.equals("N")) {
                System.out.println("Fin del programa.");
                break;
            }
        }

        scanner.close();
    }
}