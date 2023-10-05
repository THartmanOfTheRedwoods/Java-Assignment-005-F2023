import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);
    // public static method that returns a double with one variable
    // this cover celsuis to ferhrenhiet
    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
    }
    // public static method that returns a double with one variable
    // this converts celsius to kelvin
    public static double convertC2K(double celsius) {
        return celsius + 273.15;
    }
    // public static method that returns a double with one variable
    // this converts fahrenhiet to celsius

    public static double convertF2C(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    // This is a public method that has a static access modifier
    // This is a class method that returns a double
    // It requires one parameter (farenheit) its a double
    // The body of the method takes the fahrenhiet input then converts it to the convertF2C then finnaly converts to convertC2K.
    public static double convertF2K(double fahrenheit) {

        return convertC2K(convertF2C(fahrenheit));
    }
    // public static method that returns a double with one variable
    // this converts kelvins to celsius
    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }
    // public statis method that retunrs a double with one variable
    // this one is having you enter the temperature to convert

    public static double convertK2F(double kelvin){
        return (kelvin - 273.15) * 9/5 + 32;
    }
    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    // This is a public method that has a static acces modifier .
    // This is a class method that returns a String
    // This does not require any parameters
    // This body of method prints out four lines then waits for the input of the user
    // Format specifiers begin with a percent character (%) and terminate with a “type character” which indicates the type of data
    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }


    public static void main(String[] args) {
        while(true) {
            String from = getUnitChoice();
            if (from.equals("q"))
            {
                System.exit(0);
            }
            double temp = getTemp(from);
            String to = getUnitChoice();
            if (to.equals ("q"))
            {
                System.exit(0);
            }
            double convertedTemperature = 0;


            switch (from.toUpperCase() + to.toUpperCase()) {
                case "CF":
                    convertedTemperature = convertC2F(temp);
                    break;
                case "CK":
                    convertedTemperature = convertC2K(temp);
                    break;
                case "FC":
                    convertedTemperature = convertF2C(temp);
                    break;
                case "FK":
                    convertedTemperature = convertF2K(temp);
                    break;
                case "KC":
                    convertedTemperature = convertK2C(temp);
                    break;
                case "KF":
                    convertedTemperature = convertK2F(temp);
                    break;
                default:
                    System.out.println("Invalid temperature units selected.");
                    break;
            }

            System.out.println("Result " + temp + " is " + convertedTemperature);

                }
                }
            }


