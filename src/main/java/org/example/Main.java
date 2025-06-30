package org.example;

import java.util.*;

public class Main {
    // Function that accepts a float in Celsius and returns its value converted to Fahrenheit
    public static float convertCelsiusToFahrenheit (float celsius) {
        return (celsius * ((float) 9 / 5))+ 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks for Celsius user input
        System.out.print("Enter temperature in Celsius: ");
        float inputTemperature = scanner.nextFloat();

        // Converts Celsius user input to Fahrenheit
        float fahrenheit = convertCelsiusToFahrenheit(inputTemperature);
        System.out.printf("Temperature in Fahrenheit: %.2f", fahrenheit);
    }
}