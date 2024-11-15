import java.util.Scanner;

public class ActividadCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos un número entre 1 y 10
        // En el ejercicio no se especificó si entero, así que puse float
        System.out.println("Introduzca un número entre el 1 y el 10: ");
        float userNumber = scanner.nextFloat();

        // Mientras el número sea menor que 1 o mayor que 10, estamos en bucle
        while (userNumber < 1 || userNumber > 10) {
            // Mostramos el error
            System.out.println("ERROR: Número fuera de rango. \nPor favor, introduce un número entre 1 y 10: ");
            // Solicitamos nuevamente el número
            userNumber = scanner.nextFloat();
        }

        // Cuando se cumple la norma y sale del bucle, mostramos el número
        System.out.println("DENTRO DEL RANGO. El número introducido es: " + userNumber);

        scanner.close();

    }
}
