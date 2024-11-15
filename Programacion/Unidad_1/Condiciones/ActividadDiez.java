import java.util.Scanner;

public class ActividadDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitar dos números enteros al usuario
            System.out.print("Introduce el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Introduce el segundo número: ");
            int numero2 = scanner.nextInt();

            // Verificar si cualquiera de los números es -1, en cuyo caso termina el
            // programa
            if (numero1 == -1 || numero2 == -1) {
                System.out.println("Has introducido -1. El programa ha concluido.");
                break;
            }

            // Calcular la multiplicación
            int resultado = numero1 * numero2;

            // Verificar si el resultado sobrepasa 100, en cuyo caso termina el programa
            if (resultado > 100) {
                System.out.println("El resultado es " + resultado + ". Sobrepasa 100. El programa ha concluido.");
                break;
            }

            // Mostrar el resultado de la multiplicación
            System.out.println("El resultado de la multiplicación es: " + resultado);

            // El programa continúa solicitando nuevos números hasta que se cumpla alguna
            // condición de salida
        }

        scanner.close();
    }
}
