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

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }
    public static double convertK2F(double kelvin) {
        // Using the existing methods convertK2C I need to turn Kelvin into celius
        double celsius = convertK2C(kelvin);
        //Turns celsius to fahrenheit
        return convertC2F(celsius);
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
                System.out.println("Exiting the program. Goodbye!");
                break; // this is something i found on google that i could use to quit the program instead of having two different Ifs
            }

            if (!(fromUnit.equalsIgnoreCase("C") || fromUnit.equalsIgnoreCase("F") || fromUnit.equalsIgnoreCase("K"))
                    || !(toUnit.equalsIgnoreCase("C") || toUnit.equalsIgnoreCase("F") || toUnit.equalsIgnoreCase("K"))) {
                System.out.println("Invalid choice. Please enter C, F, or K to convert or Q to quit.");
                continue; // here is a edge case i thought of since i revisted the assignment and made the code shorter
            }

            double temperature = getTemp(fromUnit);

            switch (toUnit.toUpperCase()) {
                case "C":
                    System.out.printf("Result %.6f%s is %.6f%s%n", temperature, fromUnit, convertF2C(temperature), toUnit);
                    break;
                case "F":
                    System.out.printf("Result %.6f%s is %.6f%s%n", temperature, fromUnit, convertC2F(temperature), toUnit);
                    break;
                case "K":
                    System.out.printf("Result %.6f%s is %.6f%s%n", temperature, fromUnit, convertC2K(temperature), toUnit);
                    break;
            }
        }

        }
    }
