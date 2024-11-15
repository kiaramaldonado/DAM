import java.util.Scanner;

public class ActividadDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos una cadena de texto al usuario
        System.out.println("Introduzca un texto, por favor: ");
        String text = scanner.nextLine();

        // Mostramos un pequeño menú al usuario con las opciones existentes
        // Para seleccionar cada una solo tiene que introducir un número: 1, 2, 3.
        System.out.println(
                "A continuación indique qué acción prefiere:  \n Introduce '1' para transformar el texto a mayúsculas. \n Introduce '2' para transformar el texto a minúsculas \n Introduce '3' para sustituir los espacios por barrabajas.");
        int action = scanner.nextInt();

        // Dependiendo del número introducido (valor de 'action'), realizamos una acción
        switch (action) {
            case 1:
                // Si '1', imprimimos el texto todo mayúsculas
                System.out.println(text.toUpperCase());
                break;
            case 2:
                // Si '2', imprimimos el texto todo minúsculas
                System.out.println(text.toLowerCase());
                break;
            case 3:
                // Si '3', imprimimos el texto reemplazando los espacios por barrabajas
                System.out.println(text.replaceAll(" ", "_"));
                break;
            default:
                // Si se introduce otro valor, mostramos un mensaje avisando al usuario del
                // problema.
                System.out.println("ERROR: El valor introducido debe ser 1, 2 o 3");
                break;

            // En cualquier caso, el programa finalizará tras introducir una opción
        }

        scanner.close();
    }
}