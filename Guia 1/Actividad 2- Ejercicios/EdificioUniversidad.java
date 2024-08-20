import java.util.Scanner;

public class EdificioUniversidad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de estudiantes de la universidad
        System.out.print("Ingrese el número de estudiantes que tiene la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        // Leer la capacidad de un salón
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        // Leer el número de salones por piso
        System.out.print("Ingrese el número de salones que tendrá un piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones necesarios
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);

        // Calcular el número de pisos necesarios
        int numeroPisos = calcularNumeroPisos(numeroSalones, salonesPorPiso);

        // Mostrar los resultados
        System.out.printf("Número de salones necesarios: %d%n", numeroSalones);
        System.out.printf("Número de pisos necesarios: %d%n", numeroPisos);

        scanner.close();
    }

    // Función que calcula el número de salones necesarios
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        // Se utiliza el techo de la división para obtener el número completo de salones
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función que calcula el número de pisos necesarios
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        // Se utiliza el techo de la división para obtener el número completo de pisos
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }
}
