import lib.TemperatureConverter;
import lib.DistanceConverter;
import lib.WeightConverter;
import java.util.Scanner;


public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Unidades ===");
        System.out.println("1. Temperatura");
        System.out.println("2. Distancia");
        System.out.println("3. Peso");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese grados Celsius: ");
                double c = scanner.nextDouble();
                System.out.println("Celsius a Fahrenheit: " + TemperatureConverter.celsiusToFahrenheit(c));
                System.out.println("Celsius a Kelvin: " + TemperatureConverter.celsiusToKelvin(c));
                break;

            case 2:
                System.out.print("Ingrese kilómetros: ");
                double km = scanner.nextDouble();
                System.out.println("Kilómetros a Millas: " + DistanceConverter.kmToMiles(km));
                break;

            case 3:
                System.out.print("Ingrese kilogramos: ");
                double kg = scanner.nextDouble();
                System.out.println("Kilogramos a Libras: " + WeightConverter.kgToPounds(kg));
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}