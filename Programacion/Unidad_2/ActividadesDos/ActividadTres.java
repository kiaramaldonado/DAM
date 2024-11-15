import java.util.Scanner;

public class ActividadTres {

    public static int wordCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONTADOR DE PALABRAS\nIntroduce un texto:");
        String text = scanner.nextLine();

        System.out.println("El texto contiene " + wordCount(text) + " palabras.");

        scanner.close();
    }
}
