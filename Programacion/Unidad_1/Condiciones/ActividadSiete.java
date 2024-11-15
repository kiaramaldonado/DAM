import java.util.Scanner;

public class ActividadSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Introduce un número para ver en la semana (0 para salir): ");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("El día " + number + " de la semana es Lunes!");
                    break;
                case 2:
                    System.out.println("El día " + number + " de la semana es Martes!");
                    break;
                case 3:
                    System.out.println("El día " + number + " de la semana es Miércoles!");
                    break;
                case 4:
                    System.out.println("El día " + number + " de la semana es Jueves!");
                    break;
                case 5:
                    System.out.println("El día " + number + " de la semana es Viernes!");
                    break;
                case 6:
                    System.out.println("El día " + number + " de la semana es Sábado!");
                    break;
                case 7:
                    System.out.println("El día " + number + " de la semana es Domingo!");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Introduce un número válido entre 1 y 7.");
            }
        } while (number != 0);

        scanner.close();
    }

}
