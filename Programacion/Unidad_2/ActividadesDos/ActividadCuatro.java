import java.util.Scanner;

public class ActividadCuatro {

    private static int[] evenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] evenNumberArray = new int[count];
        int j = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumberArray[j] = number;
                j++;
            }
        }

        return evenNumberArray;
    }

    private static void showNumbers(int[] evenNumberArray) {
        System.out.println("Los números en posiciones pares son:");
        for (int index = 0; index < evenNumberArray.length; index++) {
            if (index > 0) {
                System.out.print(", ");
            }
            System.out.print(evenNumberArray[index]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuánta capacidad quieres en tu array de números enteros?");
        int capacity = scanner.nextInt();

        int[] numbers = new int[capacity];

        System.out.println("Introduce un valor para cada espacio de capacidad en el Array:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Posición: " + index + " | Valor: ");
            int newValue = scanner.nextInt();
            numbers[index] = newValue;
        }

        int[] evenNumberArray = evenNumbers(numbers);
        showNumbers(evenNumberArray);

        scanner.close();
    }
}
