import java.util.Scanner;

public class ActividadDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario dos números guardados como texto
        System.out.println("Introduzca un primer número para calcular: ");
        String userNumberFirstText = scanner.nextLine();

        System.out.println("Introduzca un segundo número para calcular: ");
        String userNumberSecondText = scanner.nextLine();

        // Para convertirlo a entero como en la actividad, por prevención de errores en
        // caso de haber introducido decimales, primero los convertimos a float
        float userNumberFirstFloat = Float.parseFloat(userNumberFirstText);
        float userNumberSecondFloat = Float.parseFloat(userNumberSecondText);

        // Ahora que el programa acepta el POSIBLE número decimal introducido por el
        // usuario, lo pasamos a entero como pide el ejercicio (cabe mencionar que, por
        // ende, el valor del número varía y del resultado final también)
        int userNumberFirst = ((int) userNumberFirstFloat);
        int userNumberSecond = ((int) userNumberSecondFloat);

        // Guardamos los resultados de las posibles operaciones
        int sum = (userNumberFirst + userNumberSecond);
        int substract = (userNumberFirst - userNumberSecond);
        int multiply = (userNumberFirst * userNumberSecond);

        // Preguntamos la operación deseada
        System.out.println(
                "¿Qué tipo de operación deseas realizar \nIntroduzca '1' para sumar, '2' para restar y '3' para multiplicar:");
        int calculation = scanner.nextInt();

        // Mostramos dicha operación
        switch (calculation) {
            case 1:
                System.out.println("La suma de sus números resulta tal que así: \n" + userNumberFirst + " + "
                        + userNumberSecond + " = " + sum);
                break;
            case 2:
                System.out.println("La resta de sus números resulta tal que así: \n" + userNumberFirst + " - "
                        + userNumberSecond + " = " + substract);
                break;
            case 3:
                System.out.println("La multiplicación de sus números resulta tal que así: \n" + userNumberFirst + " x "
                        + userNumberSecond + " = " + multiply);
                break;
            // Mostramos error en caso de otro valor
            default:
                System.out.println("Lo sentimos, operación no válida.");
                break;
        }

        scanner.close();
    }
}