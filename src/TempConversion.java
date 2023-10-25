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

    // Implement convertK2F method
    public static double convertK2F(double kelvin){
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

        return input.nextLine().toUpperCase(); // Normalize input
    }

    public static void main(String[] args) {
        while(true) {
            // Request initial unit and value
            System.out.println("Please choose starting temperature unit: ");
            String choice1 = getUnitChoice();
            if (choice1.equals("Q") || !choice1.matches("C|F|K")) break; // Quit conditions

            // Request and store temperature value
            double choice1Val = getTemp(choice1);

            // Request desired unit to convert to
            System.out.println("\nPlease choose desired temperature unit: ");
            String choice2 = getUnitChoice();
            if (choice2.equals("Q") || !choice2.matches("C|F|K")) break; // Quit conditions

            String concat = choice1Val + "°" + choice1 + " converted to °" + choice2 + " is equal to: ";

            switch(choice1 + choice2){
                case "CF":
                    System.out.println(concat + convertC2F(choice1Val) + "°" + choice2 + "\n");
                    break;
                case "CK":
                    System.out.println(concat + convertC2K(choice1Val) + "°" + choice2 + "\n");
                    break;
                case "FC":
                    System.out.println(concat + convertF2C(choice1Val) + "°" + choice2 + "\n");
                    break;
                case "FK":
                    System.out.println(concat + convertF2K(choice1Val) + "°" + choice2 + "\n");
                    break;
                case "KC":
                    System.out.println(concat + convertK2C(choice1Val) + "°" + choice2 + "\n");
                    break;
                case "KF":
                    System.out.println(concat + convertK2F(choice1Val) + "°" + choice2 + "\n");
                    break;
                default:
                    System.out.println("Quit playin' games.");
            }

            // Break loop request
            System.out.print("Would you like to continue? Y/N: ");
            String choice3 = input.nextLine().toUpperCase();
            if (!choice3.equals("Y")) break;
        }
        System.out.println("\nExiting...");
    }
}