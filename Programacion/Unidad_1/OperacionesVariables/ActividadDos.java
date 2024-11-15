import java.util.Scanner;

public class ActividadDos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario su nombre
        System.out.println("Hola buenas, ¿cómo te llamas?");
        String nombre = scanner.nextLine();

        // Solicita al usuario su edad
        System.out.println("Bonito nombre, " + nombre + ". Ahora dime tu edad:");
        int edad = scanner.nextInt();

        // Muestra sendos datos con un saludo personalizado
        // Voy a personalizarlo según mayoría de edad, por probar
        boolean mayorDeEdad = (edad >= 18);

        if (mayorDeEdad == true) {
            System.out.println("Bienvenido " + nombre + ", estás muy bien para tener " + edad + " años ;)");
        } else {
            System.out.println(
                    "Mmm... lo siento, " + nombre + "... deberías de irte a una página que sea para chavales de " + edad
                            + " años :/");
        }

        scanner.close();
    }
}
