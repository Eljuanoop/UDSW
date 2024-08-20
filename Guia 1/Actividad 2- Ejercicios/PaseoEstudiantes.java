import java.util.Scanner;

public class PaseoEstudiantes {

    // Función que calcula el número de buses necesarios
    public static int calcularBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Cada estudiante gordo ocupa dos sillas
        int sillasOcupadasPorGordos = estudiantesGordos * 2;
        
        // Cada estudiante flaco ocupa una silla
        int sillasOcupadasPorFlacos = estudiantesFlacos;

        // Total de sillas ocupadas
        int sillasTotalesOcupadas = sillasOcupadasPorGordos + sillasOcupadasPorFlacos;

        // Calcular el número de buses necesarios
        // Si las sillas totales ocupadas no son un múltiplo exacto de las sillas por bus, se requiere un bus adicional
        int busesNecesarios = (int) Math.ceil((double) sillasTotalesOcupadas / sillasPorBus);

        return busesNecesarios;
    }

    // Método principal
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de sillas por bus
        System.out.print("Ingrese el número de sillas por bus: ");
        int sillasPorBus = scanner.nextInt();

        // Pedir al usuario que ingrese el número de estudiantes gordos
        System.out.print("Ingrese el número de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();

        // Pedir al usuario que ingrese el número de estudiantes flacos
        System.out.print("Ingrese el número de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();

        // Calcular el número de buses necesarios
        int busesNecesarios = calcularBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        // Mostrar el resultado
        System.out.println("El número de buses necesarios es: " + busesNecesarios);

        // Cerrar el Scanner
        scanner.close();
    }
}
