/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @since Version 1.0
 *
 */

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

    public static double convertK2F(double Kelvin) {
        return convertC2F(convertK2C(Kelvin));
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
        while (true) {
            System.out.println("Converting temperatures:");
            String fromTemp = getUnitChoice();

            if (fromTemp.equals("Q")) {
                System.out.println("Bye.");
                break;
            }

            System.out.println("Please enter temperature to convert to:");
            String toTemp = getUnitChoice();

            if (toTemp.equals("Q")) {
                System.out.println("Bye.");
                break;
            }

            if (!toTemp.equals("C") && !toTemp.equals("F") && !toTemp.equals("K")) {
                System.out.println("Not a valid unit choice.");
                continue;
            }

            double temperature = getTemp(fromTemp);

            double result;
            switch (fromTemp) {
                case "C":
                    switch (toTemp) {
                        case "F":
                            result = convertC2F(temperature);
                            System.out.printf("Result %.6f°C is %.6f°F%n", temperature, result);
                            break;
                        case "K":
                            result = convertC2K(temperature);
                            System.out.printf("Result %.6f°C is %.6fK%n", temperature, result);
                            break;
                        default:
                            System.out.println("Not a valid unit choice.");
                            break;
                    }
                    break;
                case "F":
                    switch (toTemp) {
                        case "C":
                            result = convertF2C(temperature);
                            System.out.printf("Result %.6f°F is %.6f°C%n", temperature, result);
                            break;
                        case "K":
                            result = convertF2K(temperature);
                            System.out.printf("Result %.6f°F is %.6fK%n", temperature, result);
                            break;
                        default:
                            System.out.println("Not a valid unit choice.");
                            break;
                    }
                    break;
                case "K":
                    switch (toTemp) {
                        case "C":
                            result = convertK2C(temperature);
                            System.out.printf("Result %.6fK is %.6f°C%n", temperature, result);
                            break;
                        case "F":
                            result = convertK2F(temperature);
                            System.out.printf("Result %.6fK is %.6f°F%n", temperature, result);
                            break;
                        default:
                            System.out.println("Not a valid unit choice.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Not a valid unit choice.");
                    break;
            }
        }
    }
}


