import java.util.Scanner;

public class ActividadTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos un número entero al usuario para posteriormente multiplicar
        System.out.println("Introduzca un número entero para mostrar su tabla del 10:");

        // Lo guardo en una variable tipo float para que le sea posible introducir un
        // número con decimales
        float userNumber = scanner.nextFloat();

        // ¿CÓMO SABEMOS SI ES ENTERO FÁCILMENTE?
        // Con una variable boolean almacenamos la condición que nos lo dirá:
        // Comparamos el número introducido consigo mismo, pero CASTEADO como INT
        // Si su valor es el mismo como float (decimales) que casteado (sin decimales)
        // ----> ES ENTERO!!
        // Si su valor no es el mismo al ser casteado (es decir, quitando decimales)
        // ----> NO ES ENTERO!!
        boolean isWhole = (userNumber == (int) userNumber);

        // Creo la variable 'multiple' donde guardaré los números del 1 al 10
        int multiple;

        if (isWhole) {
            // Si el boolean da true: el número es entero; e imprimimos la tabla
            // Ahora siempre casteo userNumber para mostrar por ejemplo '8' y no '8.0'
            System.out.println("La tabla del 10 del número " + (int) userNumber + " luce así:");

            // Por cada iteración, del 1 al 10, sumamos 1 al valor de i
            for (int i = 1; i <= 10; i++) {
                // Ahora la variable múltiple obtendrá el valor de i
                multiple = i;
                // Además, con cada iteración multiplicamos 'multiple' con el userNumber
                // Guardando a su vez el resultado en una variable entera
                int result = multiple * (int) userNumber;
                // Ahora, imprimimos la operación para que sea más legible
                System.out.println((int) userNumber + " x " + multiple + " = " + result);

                // Se repite hasta llegar al 10, creando así una tabla de multiplicar
            }
        } else {
            // Si el boolean da false: el número no es entero. No multiplicamos.
            System.out.println(
                    "Lo siento, el número " + userNumber + " no es entero. No se procederá a mostrar su tabla del 10.");
        }

        scanner.close();
    }
}