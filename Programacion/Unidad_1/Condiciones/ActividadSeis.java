import java.util.Scanner;

public class ActividadSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int number = scanner.nextInt();

        int multNumber = 0;

        System.out.println("La tabla del 10 del número " + number + " luce así:");
        while (multNumber <= 10) {

            int result = number * multNumber;

            System.out.println(number + " x " + multNumber + " = " + result);

            multNumber++;
        }

        scanner.close();
    }
}
