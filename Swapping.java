import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tú número de documento (sin puntos): ");
        int x = scanner.nextInt();

        System.out.print("Ingresa tú edad: ");
        int y = scanner.nextInt();

        scanner.close();
        
        System.out.println("Valores iniciales: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Valores intercambiados: x = " + x + ", y = " + y);
    }
}