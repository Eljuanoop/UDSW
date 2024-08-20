import java.util.Scanner;

public class AumentoSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el sueldo actual del empleado
        System.out.print("Ingrese el sueldo actual del empleado: $ ");
        double sueldoActual = scanner.nextDouble();

        // Calcular el valor del aumento usando la función
        double aumento = calcularAumento(sueldoActual);

        // Calcular el nuevo salario
        double nuevoSalario = sueldoActual + aumento;

        // Imprimir el valor del aumento y el nuevo salario
        System.out.printf("El aumento es: $ %.2f%n", aumento);
        System.out.printf("El nuevo salario es: $ %.2f%n", nuevoSalario);

        scanner.close();
    }

    // Función que calcula el valor del aumento según el sueldo actual
    public static double calcularAumento(double sueldo) {
        if (sueldo <= 800000) {
            return sueldo * 0.10;  // Aumento del 10%
        } else if (sueldo > 800000 && sueldo <= 1200000) {
            return sueldo * 0.08;  // Aumento del 8%
        } else {
            return sueldo * 0.05;  // Aumento del 5%
        }
    }
}
