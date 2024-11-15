import java.util.Scanner;

public class ActivityFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena de texto:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        System.out.println("Las palabras en posiciones pares son:");
        for (int index = 0; index < words.length; index++) {
            if (index % 2 == 0) {
                System.out.println(words[index]);
            }
        }

        scanner.close();
    }
}