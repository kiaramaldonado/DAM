import java.util.Scanner;

public class ActivityOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Introduce una cadena de texto con tres palabras de cuatro letras separadas por espacios:");
        String text = scanner.nextLine();

        // Dividir la cadena en palabras WORDS
        String[] words = text.split(" ");

        // Boolean si tiene 3 palabras
        boolean threeWords = words.length == 3;

        // Si hay exactamente 3 palabras...
        if (threeWords) {

            // Verificar que cada palabra tiene exactamente 4 letras
            boolean fourLetters = true;
            for (String word : words) {
                if (word.length() != 4) {
                    fourLetters = false;
                }
            }

            // Si todo es válido mostramos palabra
            if (fourLetters) {
                System.out.println("La palabra del medio es: " + words[1]);
            } else {
                // Si no tiene 4 letras...
                System.out.println("Error: Todas las palabras deben tener exactamente 4 letras.");
            }
        } else {
            // Si no tiene tres palabras
            System.out.println("Error: Debes ingresar exactamente tres palabras.");
        }
        scanner.close();
    }
}