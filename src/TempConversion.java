import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);
    public static double convertK2F(double kelvin) { double celsius = convertK2C(kelvin);
    return convertC2F(celsius);
    }

    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
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
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Choose the temperature unit to convert FROM:");
            String fromUnit = getUnitChoice();

            if (fromUnit.equalsIgnoreCase("Q")) {
                break;
            }

            System.out.println("Choose the temperature unit to convert TO:");
            String toUnit = getUnitChoice();

            if (toUnit.equalsIgnoreCase("Q")) {
                break;
            }

            double temperature = getTemp(fromUnit);
            double convertedTemperature = 0.0;

            switch (fromUnit.toUpperCase() + toUnit.toUpperCase()) {
                case "CF":
                    convertedTemperature = convertC2F(temperature);
                    break;
                case "CK":
                    convertedTemperature = convertC2K(temperature);
                    break;
                case "FC":
                    convertedTemperature = convertF2C(temperature);
                    break;
                case "FK":
                    convertedTemperature = convertF2K(temperature);
                    break;
                case "KC":
                    convertedTemperature = convertK2C(temperature);
                    break;
                case "KF":
                    convertedTemperature = convertK2F(temperature);
                    break;
                default:
                    System.out.println("Invalid temperature units selected.");
                    break;
            }

            System.out.printf("%.2f °%s is equal to %.2f °%s%n", temperature, fromUnit, convertedTemperature, toUnit);
        }
    }
}