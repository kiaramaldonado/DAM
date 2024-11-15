import java.util.Scanner;

public class ActivityThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicite su nombre completo al usuario
        System.out.println("Introduzca su nombre completo: ");
        String fullName = scanner.nextLine();
        // y que lo convierta a mayúsculas
        String upperFullName = fullName.toUpperCase();

        // Pedir un número total de facturas.
        System.out.println("¿Cuántas facturas almacenará?");
        int numberRecipes = scanner.nextInt();

        float[] importsRecipes = new float[numberRecipes];

        // Almacenar el importe de las facturas en una lista
        for (int index = 0; index < importsRecipes.length; index++) {
            System.out.print("Importe factura nº " + (index + 1) + " = ");
            importsRecipes[index] = scanner.nextFloat();
        }

        // Mostrar los importes ingresados
        System.out.print("Buenas, " + upperFullName + ". \n Los importes de las facturas son: \n");
        for (float importe : importsRecipes) {
            System.out.print(importe + " \n"); // Mostrar cada importe
        }

        scanner.close();
    }
}