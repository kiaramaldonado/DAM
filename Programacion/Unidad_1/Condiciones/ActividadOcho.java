import java.util.Random;
import java.util.Scanner;

public class ActividadOcho {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("A continuación introduce 3 números:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println("Has elegido los números " + number1 + ", " + number2 + " y " + number3);

        int loteria = 0;

        for (int i = 0; i < 1; i++) {
            loteria = random.nextInt(10) + 1;
        }

        if (loteria == number1 || loteria == number2 || loteria == number3) {
            System.out.println("¡Ganaste! La lotería era: " + loteria);
        } else {
            System.out.println("Hoy no es tu día de suerte... La lotería era: " + loteria);
        }

        scanner.close();
    }
}
