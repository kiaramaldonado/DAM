import java.util.Scanner;

public class ActivityTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstList = new int[5];

        for (int index = 0; index < firstList.length; index++) {
            System.out.print("Para la primera lista, introduce un número: ");
            firstList[index] = scanner.nextInt();
        }

        int[] secondList = new int[5];

        for (int index = 0; index < secondList.length; index++) {
            System.out.print("Para la segunda lista, introduce un número: ");
            secondList[index] = scanner.nextInt();
        }

        // Mezclamos en bucle for
        int[] remix = new int[10];
        for (int index = 0; index < firstList.length; index++) {
            remix[index * 2] = firstList[index]; // Indices pares
            remix[index * 2 + 1] = secondList[index]; // Indices impares
        }

        System.out.print("Fusión: ");
        for (int num : remix) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}