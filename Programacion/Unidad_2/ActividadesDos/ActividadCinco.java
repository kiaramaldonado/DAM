import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActividadCinco {

    public static boolean isValidEmail(String email) {
        String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@(gmail|email)\\.com$";
        Pattern pattern = Pattern.compile(emailPattern);

        boolean isValid = true;
        if (email != null) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Válido");
            } else {
                System.out.println("NO Válido");
                return false;
            }
        } else {
            System.out.println("NO Válido");
            isValid = false;
        }

        return isValid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un correo electrónico válido:");
        String email = scanner.nextLine();

        isValidEmail(email);

        scanner.close();
    }
}