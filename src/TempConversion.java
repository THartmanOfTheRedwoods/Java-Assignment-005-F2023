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
            String choice = getUnitChoice();

            switch (choice.toUpperCase()) {
                case "C":
                    double celsius = getTemp("C");
                    System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", celsius, convertC2F(celsius), convertC2K(celsius));
                    break;
                case "F":
                    double fahrenheit = getTemp("F");
                    System.out.printf("%.2f°F is equal to %.2f°C and %.2fK%n", fahrenheit, convertF2C(fahrenheit), convertF2K(fahrenheit));
                    break;
                case "K":
                    double kelvin = getTemp("K");
                    System.out.printf("%.2fK is equal to %.2f°C and %.2f°F%n", kelvin, convertK2C(kelvin), convertC2F(convertK2C(kelvin)));
                    break;
                case "Q":
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
    }
}