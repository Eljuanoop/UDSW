/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " ha ingresado.");
    }

    public void registrarSalida(String placa) {
        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);
        if (vehiculo != null) {
            LocalDateTime horaSalida = LocalDateTime.now();
            Duration duracion = Duration.between(vehiculo.getHoraEntrada(), horaSalida);
            long minutosEstadia = duracion.toMinutes();
            double costo = calcularCosto(vehiculo, minutosEstadia);
            vehiculos.remove(vehiculo);
            System.out.println("Vehículo con placa " + placa + " ha salido.");
            System.out.println("Tiempo de estadía: " + minutosEstadia + " minutos.");
            System.out.println("Costo total a pagar: $" + costo);
        } else {
            System.out.println("No se encontró un vehículo con la placa " + placa);
        }
    }

    public List<Vehiculo> consultarEstado() {
        return vehiculos;
    }

    private Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null;
    }

    private double calcularCosto(Vehiculo vehiculo, long minutosEstadia) {
        double tarifaPorHora;
        if (vehiculo instanceof Motocicleta) {
            tarifaPorHora = 1000.0;
        } else if (vehiculo instanceof Automovil) {
            tarifaPorHora = 2000.0;
        } else if (vehiculo instanceof Camion) {
            tarifaPorHora = 3000.0;
        } else {
            tarifaPorHora = 0.0;
        }
        return (minutosEstadia / 60.0) * tarifaPorHora;
    }
}
