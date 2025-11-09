# Prompt utilizado:

"Explícame cómo crear una librería en Java que permita reutilizar código para convertir unidades de medida como temperatura (Celsius, Fahrenheit, Kelvin), distancia (kilómetros a millas) y peso (kilogramos a libras). Solo quiero lo básico: estructura de carpetas, clases necesarias y ejemplos simples de uso."


Una librería es simplemente un conjunto de clases organizadas en paquetes que se pueden reutilizar desde otros programas sin volver a escribir el código.


📁 Estructura básica del proyecto:
UnidadConversor/
 ├── src/
 │   ├── lib/              ← Aquí está la librería
 │   │   └── converters/
 │   │        ├── TemperatureConverter.java
 │   │        ├── DistanceConverter.java
 │   │        └── WeightConverter.java
 │   └── app/              ← Aquí está la aplicación que usa la librería
 │        └── Main.java

📌 Ejemplo de clase dentro de la librería (lib/converters/TemperatureConverter.java):
package lib.converters;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
}

📌 Ejemplo simple de uso en la aplicación (app/Main.java):
package app;

import lib.converters.TemperatureConverter;
import lib.converters.DistanceConverter;
import lib.converters.WeightConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println("25°C a Fahrenheit = " + TemperatureConverter.celsiusToFahrenheit(25));
        System.out.println("10 km a millas = " + DistanceConverter.kmToMiles(10));
        System.out.println("70 kg a libras = " + WeightConverter.kgToLbs(70));
    }
}
