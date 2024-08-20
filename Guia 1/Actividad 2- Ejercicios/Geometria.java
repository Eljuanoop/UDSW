import java.util.Scanner;

public class Geometria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las coordenadas del primer punto (x1, y1)
        System.out.print("Ingrese la coordenada x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y1: ");
        double y1 = scanner.nextDouble();

        // Leer las coordenadas del segundo punto (x2, y2)
        System.out.print("Ingrese la coordenada x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y2: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia entre los dos puntos
        double distancia = calcularDistancia(x1, y1, x2, y2);

        // Calcular la pendiente de la recta que une los dos puntos
        double pendiente = calcularPendiente(x1, y1, x2, y2);

        // Mostrar los resultados
        System.out.printf("La distancia entre los dos puntos es: %.2f unidades%n", distancia);
        System.out.printf("La pendiente de la recta que une los dos puntos es: %.2f%n", pendiente);

        scanner.close();
    }

    // Función para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    // Función para calcular la pendiente de la recta que une dos puntos
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }
}
