import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author MJ Fracess
 * @since Version 1.0
 **/

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

    // Part 2 - Implement Missing Method: Fingers crossed
    public static double convertK2F(double kelvin) {
        return convertC2F(convertK2C(kelvin));
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice(String prompt) {
        List<String> validChoice = new ArrayList<>();
        validChoice.add("C");
        validChoice.add("F");
        validChoice.add("K");
        validChoice.add("Q");
        while (true) {
            System.out.println(prompt);
            System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
            System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
            System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
            System.out.printf("%-4s : %40s%n", "Q).", "To quit");
            String choice = input.nextLine().trim().toUpperCase();

            if (validChoice.contains(choice)) {
                if (choice.equals("Q")) {
                    System.exit(0);
                }
                return choice;
            }
            System.out.println("Invalid choice entered. Try again");
        }
    }

    public static void main(String[] args) {
        while (true) {
            String tempFrom = getUnitChoice("Enter the From Temp");
            String tempTo = getUnitChoice("Enter the To Temp");
            double value = getTemp(tempFrom);
            double result = Double.MIN_VALUE;
            switch (tempFrom + tempTo) {
                case "CF":
                    result = convertC2F(value);
                    break;
                case "CK":
                    result = convertC2K(value);
                    break;
                case "FC":
                    result = convertF2C(value);
                    break;
                case "FK":
                    result = convertF2K(value);
                    break;
                case "KC":
                    result = convertK2C(value);
                    break;
                case "KF":
                    result = convertK2F(value);
                    break;
                case "CC":
                case "FF":
                case "KK":
                    result = value;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
            if (result != Double.MIN_VALUE) {

            }
            System.out.printf("Result %f°%s is %f°%s%n", value, tempFrom, result, tempTo);
        }


    }
}


