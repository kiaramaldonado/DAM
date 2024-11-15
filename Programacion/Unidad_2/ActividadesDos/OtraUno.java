import java.util.Scanner;
// Tenga una función que reciba un número entero como parámetro y devuelva un
// booleano indicando si es positivo o no.
// En el método principal, solicite números indefinidamente al usuario y, utilizando la
// función anterior, muestra por consola un texto informando si es positivo o negativo.

public class OtraUno {

    private static boolean positive(int userNumber) {
        boolean isPositive;

        if (userNumber >= 0) {
            isPositive = true;
        } else {
            isPositive = false;
        }

        return isPositive;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Num entero:");
            int userNumber = scanner.nextInt();

            if (positive(userNumber) == true) {
                System.out.println("Felicidades. El número es positivo");
            } else {
                System.out.println("No positivo..");
            }

            System.out.println("¿Quieres probar otro número? \n 1) Sí 2) No");
            int response = scanner.nextInt();

            if (response == 2) {
                break;
            }
        }
        scanner.close();
    }
}