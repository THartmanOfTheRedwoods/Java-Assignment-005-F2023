import java.util.Scanner;

public class TempConversion {
    double fahrenheit;
    double celsius;
    double kelvin;
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
/*This line of code has public as the access specifier, static as the access modifier, double as the return type and
* is named "convertF2K". This line of code also takes the variable "fahrenheit" as the only parameter with the specific
* type being double. I believe this is object method since it is within a class and has created the object/ memory
* reference to the object created "convertF2k".
* The flow of execution for this line of code is that it will take the value or input that is saved under the variable
* name "fahrenheit", plug it into the method "convertF2C", then take what the new value of fahrenheit is and plug it into
* the method "convertC2K".*/
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
        System.out.printf("%-4s : %26s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %26s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %26s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %7s%n", "Q).", "To quit");
        return input.nextLine();
    }
/*This block of code has the access specifier public, an access modifier of static and the return type is String. This
* object method is named "getUnitChoice". I know this is an object method because it has created the object "getUnitChoice"
* that is a memory reference and can be called on again from within the class. There are no parameters.
* The flow of execution for this block of code is that it is to spit out a bunch of formatted Strings. The formatting
* specifications are with the "%-4s" and the "%40s%n". These specifications mean that when printing these Strings to
* the console, it will plug in the first String after the comma for the first %s and the second String after the comma
* for the second. The -4 and 40 are character specifications, where -4 means that it will add as many spaces or padding
* as needed until the first String to be printed reaches 4 characters to the right of the String, then a colon, and for
*  the second String of characters it will have space for up to 40 characters to the left to fit the "to convert a *...*
* temperature". They differ because we've only used decimal specifiers that limit the amount of spaces or digits the int
* or double value will print to the console. Then return the input scanned before the enter keystroke.*/
    public static void main(String[] args) {
        boolean shouldContinue = true;
        while(shouldContinue) {
            String unit = getUnitChoice();
            switch (unit) {
                case "c": double temp = getTemp(unit);
                double cF = convertC2F(temp);
                double cK = convertC2K(temp);
                    System.out.printf("Result: %6f°C is %6f°F and %6f°K", temp, cF, cK);
                    break;
                case "k": double temp1 = getTemp(unit);
                    double kF = convertK2F(temp1);
                    double kC = convertK2C(temp1);
                    System.out.printf("Result: %6f°K is %6f°F and %6f°C", temp1, kF, kC);
                    break;
                case "f": double temp2 = getTemp(unit);
                    double fC = convertF2C(temp2);
                    double fK = convertF2K(temp2);
                    System.out.printf("Result: %6f°F is %6f°C and %6f°K", temp2, fC, fK);
                    break;
                case "q":
                    System.out.println("Quitting program");
                    break;
                default:
                    System.out.println("Incorrect input detected");
                    break;
            }shouldContinue = false;
            System.out.printf("%nExiting program....");

            }

            }
        }
