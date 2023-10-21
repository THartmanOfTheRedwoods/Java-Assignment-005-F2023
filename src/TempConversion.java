//Naqibullah Haiwadpal
//10.21.2023
import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) {
        return (celsius * (9.0 / 5)) + 32.0;
    }

    public static double convertC2K(double celsius) {
        return celsius + 273.15;
    }

    public static double convertF2C(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertF2K(double fahrenheit) {
        return convertC2K(convertF2C(fahrenheit));
    }

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }

    public static double getTemp(String unit) {
        System.out.printf("Please enter a temperature in %s: ", unit);
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.println("Select a temperature unit to convert (C, F, K, or Q to quit): ");
        return input.nextLine().toUpperCase();
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Temperature Conversion Program");
            String sourceUnit = getUnitChoice();

            if (sourceUnit.equals("Q")) {
                System.out.println("Goodbye!");
                break;
            }

            String targetUnit = getUnitChoice();

            if (targetUnit.equals("Q")) {
                System.out.println("Goodbye!");
                break;
            }

            double temperature = getTemp(sourceUnit);

            double convertedTemperature = 0.0; // Initialize with a default value.

            switch (sourceUnit) {
                case "C":
                    switch (targetUnit) {
                        case "F":
                            convertedTemperature = convertC2F(temperature);
                            break;
                        case "K":
                            convertedTemperature = convertC2K(temperature);
                            break;
                        default:
                            System.out.println("Invalid target unit. Please try again.");
                            continue; // Skip the remaining part of the loop and start over.
                    }
                    break;
                case "F":
                    switch (targetUnit) {
                        case "C":
                            convertedTemperature = convertF2C(temperature);
                            break;
                        case "K":
                            convertedTemperature = convertF2K(temperature);
                            break;
                        default:
                            System.out.println("Invalid target unit. Please try again.");
                            continue; // Skip the remaining part of the loop and start over.
                    }
                    break;
                case "K":
                    if (targetUnit.equals("C")) {
                        convertedTemperature = convertK2C(temperature);
                    } else {
                        System.out.println("Invalid target unit. Please try again.");
                        continue; // Skip the remaining part of the loop and start over.
                    }
                    break;
                default:
                    System.out.println("Invalid source unit. Please try again.");
                    continue; // Skip the remaining part of the loop and start over.
            }

            System.out.printf("Result: %.6f%s is %.6f%s%n", temperature, sourceUnit, convertedTemperature, targetUnit);
        }
    }
}
