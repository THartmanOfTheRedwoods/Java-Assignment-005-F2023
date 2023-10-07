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

    public static double convertK2F(double kelvin) { return convertC2F(convertK2C(kelvin)); }

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
        String from = getUnitChoice();
        if (from.equals("Q")) {
            System.out.println("Have a nice day.");
            return;
        }
        String to = getUnitChoice();
        if (to.equals("Q")) {
            System.out.println("Have a nice day.");
            return;
        }
        double x = getTemp(from);
        String caseStr = from + to;
        while (true) {
            switch (caseStr) {
                case "CF" -> {
                    System.out.printf("Result %f°C is %f°F\n", x, convertC2F(x));
                    return;
                }
                case "CK" -> {
                    System.out.printf("Result %f°C is %f°K\n", x, convertC2K(x));
                    return;
                }
                case "FC" -> {
                    System.out.printf("Result %f°F is %f°C\n", x, convertF2C(x));
                    return;
                }
                case "FK" -> {
                    System.out.printf("Result %f°F is %f°K\n", x, convertF2K(x));
                    return;
                }
                case "KC" -> {
                    System.out.printf("Result %f°K is %f°C\n", x, convertK2C(x));
                    return;
                }
                case "KF" -> {
                    System.out.printf("Result %f°K is %f°F\n", x, convertK2F(x));
                    return;
                }
                default -> System.out.println("No Match");

            }
        }
    }
}