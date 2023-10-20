import java.util.Scanner;

/**
 *
 * @author Trevor Hartman
 * @author Cassandra Portlock
 *
 * @since Version 1.0
 *
 */
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

    public static double convertK2F(double kelvin) {
        return convertC2F(convertK2C(kelvin));
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
            String from = getUnitChoice().toUpperCase();
            if (from.contentEquals("Q")){
                System.exit(0);
            }
            String to = getUnitChoice().toUpperCase();
        if (to.contentEquals("Q")){
            System.exit(0);
        }
            String caseStr = (from + to);
            double temp = getTemp(from);

            while (true) {

                switch (caseStr) {
                    case "CF":
                        double returnC2F = convertC2F(temp);
                        System.out.printf("Result %f°%s is %f°%s", temp, from, returnC2F, to);
                        System.out.println();
                        break;

                    case "CK":
                        double returnC2K = convertC2K(temp);
                        System.out.printf("Result %f°%s is %f°%s", temp, from, returnC2K, to);
                        System.out.println();
                        break;

                    case "FC":
                        double returnF2C = convertF2C(temp);
                        System.out.printf("Result %f°%s is %f°%s", temp, from, returnF2C, to);
                        System.out.println();
                        break;

                    case "FK":
                        double returnF2K = convertF2K(temp);
                        System.out.printf("Result %f°%s is %f°%s", temp, from, returnF2K, to);
                        System.out.println();
                        break;

                    case "KC":
                        double returnK2C = convertK2C(temp);
                        System.out.printf("Result %f°%s is %f°%s", temp, from, returnK2C, to);
                        System.out.println();
                        break;

                    case "KF":
                        double returnK2F = convertK2F(temp);
                        System.out.printf("Result %f°%s is %f°%s", temp, from, returnK2F, to);
                        System.out.println();
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + from);

                }
                break;

            }

        }

    }