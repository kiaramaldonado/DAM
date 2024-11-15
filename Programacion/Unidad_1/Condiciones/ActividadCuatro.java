import java.util.Scanner;

public class ActividadCuatro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un texto secreto:");
        String secretText = scanner.nextLine();

        if (secretText.equals("#Contraseña_Super_Secreta#")) {
            System.out.println("Contraseña correcta. \nIntroduzca el nombre de una ciudad:");
            String city = scanner.nextLine();

            System.out.println("Espiando sobre " + city);
        } else {
            System.out.println("Error brother");
        }

        scanner.close();
    }
}
