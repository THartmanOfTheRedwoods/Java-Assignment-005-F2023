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
    public static double convertK2F(double kelvin) {
        return convertC2F(kelvin - 273.15);
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
        System.out.println("Input a celsius ");
   double C = input.nextDouble();
        System.out.println("Input a kelvin ");
   double K = input.nextDouble();
        System.out.println("Input a fahrenheit ");
   double F = input.nextDouble();

        while(true) {
System.out.println("Celsius to fahrenheit " + convertC2F(C));
System.out.println("Celsius to kelvin " +convertC2K(C));
System.out.println("fahrenheit to Celsius " +convertF2C(F));
System.out.println("fahrenheit to kelvin " +convertF2K(F));
System.out.println("kelvin to fahrenheit " +convertK2F(K));
System.out.println("kelvin to Celsius " +convertK2C(K));

        System.out.println("Enter q to exit");
        String command = input.nextLine();
        if(command.toLowerCase().equals("q")){
            break;
        }

        }
    }
}