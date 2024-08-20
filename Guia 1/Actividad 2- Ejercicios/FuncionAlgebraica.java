import java.util.Scanner;

public class FuncionAlgebraica{

    // Función estática que calcula el valor de f(x, y)
    public static int calcularFuncion(int x, int y) {
        return (x * x) + (2 * x * y) + (y * y);
    }

    // Método principal
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de x
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();

        // Pedir al usuario que ingrese el valor de y
        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        // Llamada a la función estática
        int resultado = calcularFuncion(x, y);

        // Mostrar el resultado
        System.out.println("El valor de f(" + x + ", " + y + ") es: " + resultado);

        // Cerrar el Scanner
        scanner.close();
    }
}

