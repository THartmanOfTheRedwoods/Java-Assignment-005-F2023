import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

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
    public static double convertK2F(double kelvin) {
        double celsius = convertK2C(kelvin); // Convert Kelvin to Celsius
        return convertC2F(celsius); // Convert Celsius to Fahrenheit
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
            String fromUnit = getUnitChoice();
            String toUnit = getUnitChoice();

            if (fromUnit.equalsIgnoreCase("Q") || toUnit.equalsIgnoreCase("Q")) {
                System.out.println("Goodbye!");
                break; // exit the loop
            }

            double temperature = getTemp(fromUnit);

            double result = 0.0;

            result = switch (fromUnit) {
                case "C" -> switch (toUnit) {
                    case "F" -> convertC2F(temperature);
                    case "K" -> convertC2K(temperature);
                    default -> result;
                };
                case "F" -> switch (toUnit) {
                    case "C" -> convertF2C(temperature);
                    case "K" -> convertF2K(temperature);
                    default -> result;
                };
                case "K" -> switch (toUnit) {
                    case "C" -> convertK2C(temperature);
                    case "F" -> convertK2F(temperature);
                    default -> result;
                };
                default -> 0.0;
            };

            System.out.printf("Result %.6f%s is %.6f%s%n", temperature, fromUnit, result, toUnit);
            break;
        }
    }
}