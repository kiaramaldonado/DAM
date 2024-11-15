import java.util.Scanner;

public class ActivitySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[] DIAS_SEMANA = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

        String space = "      ";

        System.out.println("***************************************************");
        for (int i = 0; i < DIAS_SEMANA.length; i++) {
            if (i == 0) {
                System.out.println(DIAS_SEMANA[i]);
            } else {
                System.out.println(space + DIAS_SEMANA[i]);
                space += "         ";
            }
        }
        System.out.println("***************************************************");

        System.out.println("***************************************************");
        for (int i = 6; i < DIAS_SEMANA.length; i--) {
            if (i == 6) {
                System.out.println(DIAS_SEMANA[i]);
            } else {
                System.out.println(space + DIAS_SEMANA[i]);
                space += "         ";
            }
        }
        System.out.println("***************************************************");

        scanner.close();
    }
}