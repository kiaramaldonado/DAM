import java.util.Scanner;

public class ActividadDoce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena de texto:");
        String text = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " espacios.");

        String modifiedText = text.replaceAll(" ", "_");
        System.out.println(modifiedText);

        String modified2Text = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println(modified2Text);

        scanner.close();
    }
}
