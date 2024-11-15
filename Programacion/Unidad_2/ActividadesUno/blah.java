import java.util.Scanner;
import java.util.stream.Collectors;

public class blah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = "toño";

        String str2 = scanner.nextLine();

        System.out.println("String 1: " + str1 + " Unicode: "
                + str1.codePoints().mapToObj(Integer::toHexString).collect(Collectors.joining(" ")));

        System.out.println("String 1: " + str2 + " Unicode: "
                + str2.codePoints().mapToObj(Integer::toHexString).collect(Collectors.joining(" ")));

        scanner.close();
    }
}