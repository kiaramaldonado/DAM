import java.util.Scanner;

public class ActividadTres {
    public static void main(String[] args) {
        // Solicita dos números enteros al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a comparar números...");

        System.out.println("Introduzca primero un número entero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ahora, introduzca otro número entero: ");
        int numero2 = scanner.nextInt();

        // Compara si el primero es mayor que el segundo y guardalo en una variable
        boolean mayorQue = (numero1 > numero2);
        // Voy a comparar si es menor para diferenciar cuando sea igual
        boolean menorQue = (numero1 < numero2);

        // Muestra el resultado
        if (mayorQue == true) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (menorQue == true) {
            System.out.println(numero1 + " es menor que " + numero2);
        } else {
            // Si no es mayor ni menor pues será igual
            System.out.println(numero1 + " es igual que " + numero2);
        }

        scanner.close();
    }
}
