import java.util.Scanner;

public class ActivityTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicite un número entero al usuario
        System.out.println("Introduce un número entero mayor que 10:");
        int userNumberCapacity = scanner.nextInt();

        // Compruebe que el número sea mayor que 10 para continuar
        if (userNumberCapacity > 10) {

            // Inicialice un array de tipo entero con la capacidad indicada por el usuario
            int[] userNumberArray = new int[userNumberCapacity];

            for (int i = 0; i < userNumberArray.length; i++) {
                // Guarda en cada posición del array su propio índice
                userNumberArray[i] = i;
                // Muestra el contenido del array por consola
                System.out.println("Posición [" + i + "] = " + userNumberArray[i]);
            }

        } else {
            System.out.println("El número introducido no es mayor que 10. FIN.");
        }

        scanner.close();
    }
}