import java.util.Scanner;

public class ActividadDos {

    public static float calculateIMC(float heightInMeter, float weightInKg) {
        return weightInKg / (heightInMeter * heightInMeter);
    }

    public static String showHowBad(float imc) {
        String state;

        if (imc < 18.5) {
            state = "bajo peso";
        } else if (imc < 24.9) {
            state = "peso normal";
        } else if (imc < 29.9) {
            state = "sobrepeso";
        } else {
            state = "obesidad";
        }

        System.out.println("Tienes un IMC de " + imc + ".\nEsto significa: " + state);
        return state;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce tu altura (en metros): ");
            float heightInMeter = scanner.nextFloat();

            System.out.print("Introduce tu peso (en kg): ");
            float weightInKg = scanner.nextFloat();

            float imc = calculateIMC(heightInMeter, weightInKg);

            showHowBad(imc);

            System.out.println("¿Quieres comprobar otro IMC? (s/n):");
            String answer = scanner.next();

            if (answer.equals("n") || answer.equals("N")) {
                System.out.println("Fin del programa.");
                break;
            }
        }

        scanner.close();
    }
}