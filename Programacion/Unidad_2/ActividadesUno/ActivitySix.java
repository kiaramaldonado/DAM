import java.util.Scanner;

public class ActivitySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[] DIAS_SEMANA = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

        int numberDay;

        do {
            System.out.println("Introduzca un número del 1 al 7:");
            numberDay = scanner.nextInt();

            if (numberDay <= 7 && numberDay >= 1) {
                String nameDay = (DIAS_SEMANA[numberDay - 1]);

                System.out.println("El día " + numberDay + " de la semana es " + nameDay);
            } else if (numberDay == 0) {
                System.out.println("FIN DE BUCLE.");
            }
        } while (numberDay != 0 || numberDay > 7);

        scanner.close();
    }
}