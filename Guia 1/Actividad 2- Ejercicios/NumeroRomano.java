import java.util.Scanner;

public class NumeroRomano {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número entero
        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        // Verificar que el número esté en el rango permitido
        if (numero < 1 || numero > 99) {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        } else {
            // Obtener las decenas y unidades
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            // Convertir las decenas y unidades a números romanos
            String romanoDecenas = convertirDecenasARomano(decenas);
            String romanoUnidades = convertirUnidadesARomano(unidades);

            // Imprimir el número en romano
            System.out.println("El número en romano es: " + romanoDecenas + romanoUnidades);
        }

        scanner.close();
    }

    // Función que retorna la cifra de las decenas de un número de dos cifras
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función que retorna la cifra de las unidades de un número de dos cifras
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función que convierte un dígito en su equivalente romano para las unidades
    public static String convertirUnidadesARomano(int unidad) {
        switch (unidad) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return ""; // Para 0, retorna una cadena vacía
        }
    }

    // Función que convierte un dígito en su equivalente romano para las decenas
    public static String convertirDecenasARomano(int decena) {
        switch (decena) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return ""; // Para 0, retorna una cadena vacía
        }
    }
}
