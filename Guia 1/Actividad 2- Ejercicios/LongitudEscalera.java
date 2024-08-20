import java.util.Scanner;

public class LongitudEscalera {

    // Función que calcula la longitud de la escalera (y)
    public static double calcularLongitudEscalera(double altura, double angulo) {
        // Convertir el ángulo de grados a radianes, ya que Math.sin() trabaja con radianes
        double anguloRadianes = Math.toRadians(angulo);
        
        // Calcular la longitud de la escalera (y) usando la fórmula y = x / sin(α)
        double longitudEscalera = altura / Math.sin(anguloRadianes);

        return longitudEscalera;
    }
    // Método principal
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la altura a la que llega la escalera (x)
        System.out.print("Ingrese la altura a la que llega la escalera (x): ");
        double altura = scanner.nextDouble();

        // Pedir al usuario que ingrese el ángulo de inclinación de la escalera (α)
        System.out.print("Ingrese el ángulo de inclinación de la escalera (α) en grados: ");
        double angulo = scanner.nextDouble();

        // Calcular la longitud de la escalera (y)
        double longitudEscalera = calcularLongitudEscalera(altura, angulo);

        // Mostrar el resultado
        System.out.printf("La longitud de la escalera es: %.2f metros%n", longitudEscalera);

        // Cerrar el Scanner
        scanner.close();
    }
}
