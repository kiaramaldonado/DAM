import java.util.Scanner;

public class ActividadTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero");
        int userNumber = scanner.nextInt();

        boolean isEven = (userNumber % 2 == 0);
        boolean isMultFive = (userNumber % 5 == 0);

        if (isEven) {
            System.out.println(userNumber + " es par.");
        } else {
            if (isMultFive) {
                System.out.println(userNumber + " es múltiplo de cinco e impar.");
            } else {
                System.out.println(userNumber + " es impar.");
            }
        }

        scanner.close();
    }
}
