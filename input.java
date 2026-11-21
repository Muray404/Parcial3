import java.util.Scanner;

public class input {

    static Scanner input = new Scanner(System.in);

    static int leerEntero(String texto) {
        System.out.println(texto);
        return input.nextInt();
    }
    static double leerDouble(String texto) {
        System.out.println(texto);
        return input.nextInt();
    }
}
