import java.util.Scanner;

public class ActividadUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos un nombre al usuario
        System.out.println("Introduzca un nombre, por favor:");
        String userName = scanner.nextLine();

        // Inicializamos la variable teacherName para almacenar el nombre del profesor
        String teacherName = "Adrián";

        if (userName.length() > teacherName.length()) {
            // Si la longitud de la cadena de texto userName es mayor que el nombre del
            // profesor, lo indicamos con un mensaje.
            System.out.println("Felicidades " + userName + ", tu nombre es mayor que el del profesor " + teacherName);

        } else if (userName.length() < teacherName.length()) {
            // En caso de ser menor, solicitamos otra palabra
            System.out.println("Lo siento " + userName
                    + ", tu nombre es demasiado pequeño, añade otra palabra. Por ejemplo, tu apellido:");
            String plusWord = scanner.nextLine();

            // Mostramos la palabra inicial concatenada con la última, sin espacios (aunque
            // podríamos con)
            System.out.println(
                    "La concatenación del nombre y palabra adicional es: " + userName.concat(plusWord));
        } else {
            // Si cuentan con el mismo número de carácteres, mostramos el mensaje apropiado
            System.out.println("Ni menos, ni más. " + userName + " y " + teacherName + " valen por igual.");
        }

        scanner.close();
    }
}