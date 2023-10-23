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

    public static double convertK2F(double kelvin) { return (kelvin - 273.15) * 1.8 + 32; }

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
            System.out.println("Unit Converting from: ");
            String unFrom = getUnitChoice();

            if(unFrom.equalsIgnoreCase("Q")) {
                System.out.println("Quitting Program...");
                break;
            }

            System.out.println("Unit Converting To: ");
            String unTo = getUnitChoice();

            if (unTo.equalsIgnoreCase("Q")) {
                System.out.println("Quitting Program...");
                break;
            }

            System.out.println("Temperature Value: ");
            double tempV = getTemp(unFrom);

            double result;
            switch (unFrom.toUpperCase()) {
                case "C":
                    switch (unTo.toUpperCase()) {
                        case "F":
                            result = convertC2F(tempV);
                            System.out.printf("Result %.6f°C is %.6f°F%n", tempV, result);
                            break;
                        case "K":
                            result = convertC2K(tempV);
                            System.out.printf("Result %.6f°C is %.6f°K%n", tempV, result);
                            break;
                    }
                    break;
                case "F":
                    switch (unTo.toUpperCase()) {
                        case "C":
                            result = convertF2C(tempV);
                            System.out.printf("Result %.6f°F is %.6f°C%n", tempV, result);
                            break;
                        case "K":
                            result = convertF2K(tempV);
                            System.out.printf("Result %.6f°F is %.6f°K%n", tempV, result);
                            break;
                    }
                    break;
                case "K":
                    switch (unTo.toUpperCase()) {
                        case "C":
                            result = convertK2C(tempV);
                            System.out.printf("Result %.6f°K is %.6f°C%n", tempV, result);
                            break;
                        case "F":
                            result = convertK2F(tempV);
                            System.out.printf("Result %.6f°K is %.6f°F%n", tempV, result);
                            break;
                    }
                    break;
        }
    }
}