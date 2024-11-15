import java.util.Scanner;

public class ActividadUno {
    public static void main(String[] args) {
        // Solicita dos números enteros al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a hacer un poquito de mates...");

        System.out.println("Introduzca primero un número entero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ahora, introduzca otro número entero: ");
        int numero2 = scanner.nextInt();

        // Sumalos y añadelos a una variable
        int suma = numero1 + numero2;
        // Imprimimos la suma
        System.out.println("El resultado de la suma de " + numero1 + " más " + numero2 + " es: " + suma);

        // Restalos y añadelos a una variable
        int resta = numero1 - numero2;
        // Imprimimos la resta
        System.out.println("El resultado de la resta de " + numero1 + " menos " + numero2 + " es: " + resta);

        // Multiplícalos y añadelos a una variable
        int multiplicacion = numero1 * numero2;
        // Imprimimos la multiplicación
        System.out.println(
                "El resultado de la multiplicación de " + numero1 + " por " + numero2 + " es: " + multiplicacion);

        // Cerramos el scanner para acabar con el warning
        scanner.close();

    }
}
