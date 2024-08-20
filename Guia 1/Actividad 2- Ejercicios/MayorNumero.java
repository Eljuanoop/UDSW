import java.util.Scanner;

public class MayorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos números enteros
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Encontrar el mayor número usando la función
        int mayorNumero = encontrarMayor(numero1, numero2);

        // Imprimir el mayor de los dos números
        System.out.printf("El mayor de los dos números es: %d%n", mayorNumero);

        scanner.close();
    }

    // Función que encuentra el mayor de dos números enteros
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
