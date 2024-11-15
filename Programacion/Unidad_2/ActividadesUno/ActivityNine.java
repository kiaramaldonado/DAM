import java.util.Scanner;

public class ActivityNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstList = new int[5];

        for (int index = 0; index < 5; index++) {
            System.out.print("Para la primera lista, introduce un número: ");
            firstList[index] = scanner.nextInt();
        }

        int[] secondList = new int[5];

        for (int index = 0; index < 5; index++) {
            System.out.print("Para la segunda lista, introduce un número: ");
            secondList[index] = scanner.nextInt();
        }

        // System.out.print("Como primera lista contamos con los números: ");
        // for (int index = 0; index < firstList.length; index++) {
        // System.out.print(firstList[index] + ", ");
        // }
        // System.out.print("y como segunda lista: ");
        // for (int index = 0; index < secondList.length; index++) {
        // if (index != 0) {
        // System.out.print(", " + secondList[index]);
        // } else {
        // System.out.print(secondList[index]);
        // }
        // }

        StringBuilder firstListString = new StringBuilder();
        for (int i = 0; i < firstList.length; i++) {
            firstListString.append(firstList[i]);
            if (i < firstList.length - 1) {
                firstListString.append(", ");
            }
        }

        StringBuilder secondListString = new StringBuilder();
        for (int i = 0; i < secondList.length; i++) {
            secondListString.append(secondList[i]);
            if (i < secondList.length - 1) {
                secondListString.append(", ");
            }
        }

        System.out.println("Como primera lista contamos con los números: " + firstListString);
        System.out.println("y como segunda lista: " + secondListString);

        scanner.close();
    }
}