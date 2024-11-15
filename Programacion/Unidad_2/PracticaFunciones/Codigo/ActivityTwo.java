import java.util.Scanner;

public class ActivityTwo {

    // Colores para estilizar
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ERROR = ANSI_RED + "[ERROR]" + ANSI_RESET;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = insertQuantity(scanner);

        float[] grades = grades(scanner, capacity);

        highestGrade(grades);

        showFailedCount(grades);

        calculateAverage(grades);

        scanner.close();
    }

    // Función A: Introducir cantidad de asignaturas
    private static int insertQuantity(Scanner scanner) {
        float quantity;

        System.out.print("Introduzca el número de asignaturas: ");
        quantity = scanner.nextFloat();

        if (quantity == (int) quantity) {
            if (quantity > 0) {
                int quantitySubjects = (int) quantity;
                return quantitySubjects;
            } else {
                System.out.println(ERROR + "El número debe ser positivo. Terminando el programa...");
                System.exit(1);
            }
        } else {
            System.out.println(ERROR + "Eso no es un número entero. Terminando el programa...");
            System.exit(1);
        }

        return -1;
    }

    // Función B: Rellenar notas según cantidad
    private static float[] grades(Scanner scanner, int capacity) {
        float[] grades = new float[capacity];

        System.out.println("A continuación, introduce tus calificaciones sobre 10 (decimales aceptados):");

        for (int i = 0; i < grades.length; i++) {
            float grade;

            do {
                System.out.print("Introduce la calificación " + (i + 1) + ": ");
                grade = scanner.nextFloat();
                if (grade < 0 || grade > 10) {
                    System.out.println(ERROR + "La calificación debe estar entre 0 y 10. Inténtalo de nuevo.");
                }
            } while (grade < 0 || grade > 10);

            grades[i] = grade;
        }

        System.out.println("Las calificaciones introducidas son:");
        for (float grade : grades) {
            System.out.println(grade);
        }

        return grades;
    }

    // Función C: Mostrar nota más alta
    private static float highestGrade(float grades[]) {
        float highest = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        System.out.println("NOTA MÁS ALTA: " + highest);
        return highest;
    }

    // Procedimiento D: Mostrar el número de suspensos
    private static void showFailedCount(float[] grades) {
        int failedCount = 0;

        for (float grade : grades) {
            if (grade < 5) {
                failedCount++;
            }
        }

        System.out.println("NOTAS SUSPENSAS: " + failedCount);
    }

    // Función E: Mostrar media
    private static float calculateAverage(float[] grades) {
        float sum = 0;

        for (float grade : grades) {
            sum += grade;
        }

        float average = sum / grades.length;

        System.out.println("NOTA MEDIA: " + String.format("%.1f", average));

        return Math.round(average * 10) / 10f;
    }

}