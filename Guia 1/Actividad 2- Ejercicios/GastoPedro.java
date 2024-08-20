import java.util.Scanner;

public class GastoPedro {

    // Función que calcula el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;  // 40% del sueldo
    }

    // Función que calcula el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;  // 15% del sueldo
    }

    // Método principal
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el sueldo de Pedro
        System.out.print("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcular el gasto en arriendo y comida usando las funciones
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);

        // Calcular el dinero restante después de los gastos
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

        // Mostrar los resultados
        System.out.printf("Gasto en arriendo: %.2f%n", gastoArriendo);
        System.out.printf("Gasto en comida: %.2f%n", gastoComida);
        System.out.printf("Dinero restante: %.2f%n", dineroRestante);

        // Cerrar el Scanner
        scanner.close();
    }
}