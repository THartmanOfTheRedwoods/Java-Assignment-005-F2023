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

    public static double convertK2F(double kelvin) {return convertC2F(convertK2C(kelvin));
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

    public static String requestInput(String message) {
        System.out.println(message+ "(Q to quit)");
        String value = input.nextLine().toUpperCase();
        if(value.toUpperCase().equals("Q")) {
            System.exit(0);
        }
        return value;
    }

    public static void main(String[] args) {


        while(true) {

            String from = requestInput("enter a unit to convert from");
            String to = requestInput("enter a unit to convert to");
            double value = Double.parseDouble(
                    requestInput("enter a value to convert"));
            String caseStr = from + to;
            double result;

            switch (caseStr){
                case "FC":
                    result = convertF2C(value);
                    System.out.println(result);
                    break;
                case "FK":
                    result = convertF2K(value);
                    System.out.println(result);
                    break;
                case "CF":
                    result = convertC2F(value);
                    System.out.println(result);
                    break;
                case "CK":
                    result = convertC2K(value);
                    System.out.println(result);
                    break;
                case "KF":
                    result = convertK2F(value);
                    System.out.println(result);
                    break;
                case "KC":
                    result = convertK2C(value);
                    System.out.println(result);
                    break;
                default:
                    System.out.println("no match");

            }

        }

    }
}