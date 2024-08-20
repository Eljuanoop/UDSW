import java.util.Scanner;

public class DiaSiguiente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el nombre del día desde el teclado
        System.out.print("Ingrese el nombre de un día de la semana: ");
        String dia = scanner.nextLine().toLowerCase();

        // Obtener el nombre del día siguiente
        String diaSiguiente = obtenerDiaSiguiente(dia);

        // Imprimir el resultado
        if (diaSiguiente != null) {
            System.out.println("El día siguiente es: " + diaSiguiente);
        } else {
            System.out.println("Error: Día ingresado no es válido.");
        }

        scanner.close();
    }

    // Función que recibe el nombre de un día y retorna el nombre del día siguiente
    public static String obtenerDiaSiguiente(String dia) {
        switch (dia) {
            case "lunes": return "martes";
            case "martes": return "miércoles";
            case "miércoles": return "jueves";
            case "jueves": return "viernes";
            case "viernes": return "sábado";
            case "sábado": return "domingo";
            case "domingo": return "lunes";
            default: return null; // Si el día no es válido, retorna null
        }
    }
}
