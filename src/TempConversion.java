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
        return convertC2F(convertK2C(kelvin));
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice(String msg) {
        System.out.println(msg);
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        String v = input.nextLine();
        if(v.equals("Q")){
            System.exit(0);
        }
        return v;
    }

    public static void main(String[] args) {

        while(true) {
            String from = getUnitChoice("Make from choice");
            String to = getUnitChoice("Make to choice");
            double value = getTemp(from);
            double result = 0;
            switch(from + to) {
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
                case "KF":
                    result = convertK2F(value);
                    break;
                case "KC":
                    result = convertK2C(value);
                    break;
                default:
                    System.out.println("No Match");

        }
            System.out.printf("%f%s converts to %f%s.%n",value,from,result,to);
        }
    }
}