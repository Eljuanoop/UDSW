import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números enteros
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Leer el operador
        System.out.print("Ingrese la operación (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Calcular el resultado usando la función
        double resultado = aplicarOperacion(numero1, numero2, operador);

        // Mostrar el resultado
        System.out.printf("El resultado de la operación es: %.2f%n", resultado);

        scanner.close();
    }

    // Función que aplica la operación correspondiente según el operador
    public static double aplicarOperacion(int num1, int num2, String operador) {
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; // Retorna NaN si hay división por cero
                }
                break;
            case "%":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; // Retorna NaN si hay división por cero
                }
                break;
            case "**":
                resultado = Math.pow(num1, num2); // Calcula la potencia
                break;
            default:
                System.out.println("Operador no válido.");
                return Double.NaN; // Retorna NaN si el operador no es válido
        }

        return resultado;
    }
}