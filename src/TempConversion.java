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

            double tempV = getTemp(unFrom);

            double result = 0.0;

            result = switch (unFrom) {
                case "C" -> switch (unTo) {
                    case "F" -> convertC2F(tempV);
                    case "K" -> convertC2K(tempV);
                    default -> result;
                };
                case "F" -> switch (unTo) {
                    case "C" -> convertF2C(tempV);
                    case "K" -> convertF2K(tempV);
                    default -> result;
                };
                case "K" -> switch (unTo) {
                    case "C" -> convertK2C(tempV);
                    case "F" -> convertK2F(tempV);
                    default -> result;
                };
                default -> 0.0;
            };

            System.out.printf("Result %.6f%s is %.6f%s%n", tempV, unFrom, result, unTo);
            break;
        }
    }
}