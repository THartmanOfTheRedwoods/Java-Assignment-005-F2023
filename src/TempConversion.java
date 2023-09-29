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

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {



        while(true) {

            double tempVal;

            switch (TempConversion.getUnitChoice()) {

                case "F":

                    tempVal = TempConversion.getTemp("F");

                    switch (TempConversion.getUnitChoice()) {

                        case "C":
                            System.out.println("Result " + tempVal + "°F is " + TempConversion.convertF2C(tempVal) +"°C");
                            break;

                        case "K":
                            System.out.println(TempConversion.convertF2K(tempVal));
                            break;
                    }
                break;

                case "C":

                    tempVal = TempConversion.getTemp("C");

                    switch (TempConversion.getUnitChoice()) {

                        case "F":
                            System.out.println(TempConversion.convertC2F(tempVal));
                            break;

                        case "K":
                            System.out.println(TempConversion.convertC2K(tempVal));
                            break;
                    }
                break;

                case "K":

                    tempVal = TempConversion.getTemp("K");

                    switch (TempConversion.getUnitChoice()) {

                        case "C":
                            System.out.println(TempConversion.convertK2C(tempVal));

                            break;
                        case "F":
                            System.out.println(TempConversion.convertK2F(tempVal));
                            break;
                    }
                break;

            }
        }
    }
}