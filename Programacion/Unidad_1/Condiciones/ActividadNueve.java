import java.util.Random;
import java.util.Scanner;

public class ActividadNueve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int loteria = random.nextInt(100) + 1;

        int userNumber;
        int intento = 0;

        do {
            intento++;
            System.out.println("Introduce un número del 1 al 100: ");
            userNumber = scanner.nextInt();

            if (loteria == userNumber) {
                System.out.println("¡Felicidades! La lotería era efectivamente " + loteria);
                break;
            } else {
                System.out.println(
                        "Este fue tu intento número " + intento + ". Te quedan " + (10 - intento) + " intentos.");
            }

        } while (loteria != userNumber && intento < 10);

        if (intento == 10 && userNumber != loteria) {
            System.out.println("Lo siento, has alcanzado el número máximo de intentos. La lotería era: " + loteria);
        }

        scanner.close();
    }
}
