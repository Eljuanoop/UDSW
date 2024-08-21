/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Ingresar vehiculo");
            System.out.println("2. Registrar salida de vehiculo");
            System.out.println("3. Consultar estado del parqueadero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el tipo de vehículo (Moto, Automovil, Camion): ");
                    String tipo = scanner.nextLine();
                    
                    Vehiculo vehiculo;
                    if (tipo.equalsIgnoreCase("Moto")) {
                        System.out.print("Ingrese el cilindraje: ");
                        int cilindraje = scanner.nextInt();
                        vehiculo = new Motocicleta(placa, marca, modelo, cilindraje);
                    } else if (tipo.equalsIgnoreCase("Automovil")) {
                        System.out.print("Ingrese el tipo de combustible: ");
                        String tipoCombustible = scanner.nextLine();
                        vehiculo = new Automovil(placa, marca, modelo, tipoCombustible);
                    } else if (tipo.equalsIgnoreCase("Camion")) {
                        System.out.print("Ingrese la capacidad de carga: ");
                        double capacidadCarga = scanner.nextDouble();
                        vehiculo = new Camion(placa, marca, modelo, capacidadCarga);
                    } else {
                        System.out.println("Tipo de vehículo no válido.");
                        break;
                    }

                    parqueadero.registrarEntrada(vehiculo);
                    break;

                case 2:
                    System.out.print("Ingrese la placa del vehículo: ");
                    placa = scanner.nextLine();
                    parqueadero.registrarSalida(placa);
                    break;

                case 3:
                    System.out.println("Vehículos en el parqueadero:");
                    for (Vehiculo v : parqueadero.consultarEstado()) {
                        System.out.println("Placa: " + v.getPlaca() + ", Marca: " + v.getMarca() + ", Modelo: " + v.getModelo());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
