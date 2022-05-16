package OpenBootcamp;

import java.util.Scanner;

public class _If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero: ");
        int numeroIf = scanner.nextInt();

        if (numeroIf == 0){

            System.out.println("Numero ingresado es 0");
        } else if (numeroIf <0) {

            System.out.println("Numero ingresado es negativo");

        } else {
            System.out.println("Numero es positivo");
        }
    }
}
