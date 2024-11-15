import java.util.Scanner;

public class ActividadUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos las medidas de la piscina
        System.out.println("A continuación, elige el tamaño de tu piscina: ");

        System.out.println("Indica el ancho deseado (en metros): ");
        float width = scanner.nextFloat();
        // Float para poder incluir centímetros

        System.out.println("Indica el largo deseado (en metros): ");
        float length = scanner.nextFloat();

        System.out.println("Indica la altura deseada (en metros): ");
        float height = scanner.nextFloat();

        // Calculamos el volumen de la piscina en metros
        float volumeMeters = (width * length * height);

        // Calculamos los litros
        float volumeLiters = (volumeMeters * 1000 / 1);

        // Mostramos las entradas del usuario y el total de litros en la piscina
        System.out.println("Al tener su piscina:\n" + width + " metros de ancho \n" + length + " metros de largo \n"
                + height + " metros de alto... \nCuenta con un total de " + volumeLiters + " litros de agua en total");

        scanner.close();
    }
}