import java.util.Scanner;

public class Terreno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dimensiones de los lados A, B y C
        System.out.print("Ingrese el lado A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el lado B: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese el lado C: ");
        double C = scanner.nextDouble();

        // Calcular el área del rectángulo
        double areaRectangulo = calcularAreaRectangulo(B, C);

        // Calcular el área del triángulo
        double areaTriangulo = calcularAreaTriangulo(B, A - C);

        // Calcular el área total del terreno
        double areaTotal = areaRectangulo + areaTriangulo;

        // Calcular la hipotenusa del triángulo
        double hipotenusa = calcularHipotenusa(B, A - C);

        // Calcular el perímetro del terreno
        double perimetroTerreno = A + B + C + hipotenusa;

        // Mostrar los resultados
        System.out.printf("El área total del terreno es: %.2f unidades cuadradas%n", areaTotal);
        System.out.printf("El perímetro del terreno es: %.2f unidades%n", perimetroTerreno);
        System.out.printf("La hipotenusa del triángulo es: %.2f unidades%n", hipotenusa);

        scanner.close();
    }

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
