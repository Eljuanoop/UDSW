import java.util.Scanner;

public class CoronaCircular {

    // Función que calcula el área de un círculo dado su radio
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;  // A = πr^2
    }

    // Función que calcula el área de la corona circular
    public static double calcularAreaCorona(double radioGrande, double radioPequeno) {
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);
        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);
        
        // El área de la corona es la diferencia entre las áreas de los círculos
        return areaCirculoGrande - areaCirculoPequeno;
    }

    // Método principal
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio del círculo grande (R)
        System.out.print("Ingrese el radio del círculo grande (R): ");
        double radioGrande = scanner.nextDouble();

        // Pedir al usuario que ingrese el radio del círculo pequeño (r)
        System.out.print("Ingrese el radio del círculo pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

        // Calcular el área de los círculos
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);
        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);

        // Calcular el área de la corona circular
        double areaCorona = calcularAreaCorona(radioGrande, radioPequeno);

        // Mostrar los resultados
        System.out.printf("El área del círculo grande es: %.2f unidades cuadradas%n", areaCirculoGrande);
        System.out.printf("El área del círculo pequeño es: %.2f unidades cuadradas%n", areaCirculoPequeno);
        System.out.printf("El área de la corona circular es: %.2f unidades cuadradas%n", areaCorona);

        // Cerrar el Scanner
        scanner.close();
    }
}
