import java.util.Scanner;

public class ActivityOne {

    // Colores para estilizar
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ERROR = ANSI_RED + "[ERROR]" + ANSI_RESET;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println(ANSI_GREEN + "¡CREAREMOS UNA CIRCUNFERENCIA!\u001B[0m" + ANSI_RESET);

            int radius = insertRadius(scanner);
            System.out.println("El RADIO es: " + radius);

            String format = selectFormat(scanner);

            result(format, radius);

        } while (loop(scanner));

        scanner.close();
    }

    // Función A: Insertar radio válida
    private static int insertRadius(Scanner scanner) {
        float radiusInsertion;

        while (true) {
            System.out.print("Introduzca un radio para la circunferencia\n(VALOR ENTERO y POSITIVO): ");
            radiusInsertion = scanner.nextFloat();

            if (radiusInsertion == (int) radiusInsertion) {
                if (radiusInsertion > 0) {
                    break;
                } else {
                    System.out.println(
                            ERROR + " El número debe ser positivo. Inténtalo otra vez.");
                }
            } else {
                System.out
                        .println(
                                ERROR + " Eso no es un número entero. Inténtalo otra vez.");
            }
        }

        int radius = (int) radiusInsertion;

        return radius;
    }

    // Función B: Seleccionar formato válido
    private static String selectFormat(Scanner scanner) {

        int selectionValue;
        String format;

        do {
            System.out.println(
                    "¿En qué formato deseas el resultado? Introduzca:\n [1] para Entero\n [2] para Decimal con Dos Cifras\n [3] para Decimal de Alta Precisión");
            selectionValue = scanner.nextInt();

            switch (selectionValue) {
                case 1:
                    System.out.println("Usted ha seleccionado:" + ANSI_BLUE + " [1] para Entero." + ANSI_RESET);
                    format = "Int";
                    break;
                case 2:
                    System.out.println(
                            "Usted ha seleccionado:" + ANSI_BLUE + " [2] para Decimal con Dos Cifras" + ANSI_RESET);
                    format = "Float";
                    break;
                case 3:
                    System.out.println(
                            "Usted ha seleccionado:" + ANSI_BLUE + " [3] para Decimal de Alta Precisión" + ANSI_RESET);
                    format = "Double";
                    break;
                default:
                    System.out.println(ERROR + " Selección inválida. Inténtalo otra vez.");
                    format = "ERROR";
            }

        } while (format == "ERROR");

        return format;
    }

    // Procedimiento C: Mostrar el resultado
    private static void result(String format, int radius) {

        double diameter = 2 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println(ANSI_GREEN + "Las medidas de una circunferencia con RADIO de " + radius + ":" + ANSI_RESET);

        if (format.equals("Int")) {
            System.out.println("Diámetro: " + ANSI_BLUE + (int) diameter + ANSI_RESET);
            System.out.println("Área: " + ANSI_BLUE + (int) area + ANSI_RESET);
            System.out.println("Circunferencia: " + ANSI_BLUE + (int) circumference + ANSI_RESET);
        } else if (format.equals("Float")) {
            System.out.printf("Diámetro: " + ANSI_BLUE + "%.2f" + ANSI_RESET + "%n", (float) diameter);
            System.out.printf("Área: " + ANSI_BLUE + "%.2f" + ANSI_RESET + "%n", (float) area);
            System.out.printf("Circunferencia: " + ANSI_BLUE + "%.2f" + ANSI_RESET + "%n", (float) circumference);
        } else {
            System.out.println("Diámetro: " + ANSI_BLUE + diameter + ANSI_RESET);
            System.out.println("Área: " + ANSI_BLUE + area + ANSI_RESET);
            System.out.println("Circunferencia: " + ANSI_BLUE + circumference + ANSI_RESET);
        }
    }

    // Función D: Bucle
    private static boolean loop(Scanner scanner) {

        boolean loop = true;
        boolean invalid = true;

        do {
            System.out.println("¿Quieres calcular otra cincunferencia? (s/n):");
            String answer = scanner.next();

            if (answer.equals("n") || answer.equals("N")) {
                System.out.println(ANSI_RED + "FIN DEL PROGRAMA." + ANSI_RESET);
                loop = false;
                invalid = false;
            } else if (answer.equals("s") || answer.equals("S")) {
                loop = true;
                invalid = false;
            } else {
                System.out.println(ERROR + " Selecciona (s) o (n)...");
            }
        } while (invalid);

        return loop;
    }

}