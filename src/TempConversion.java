/*Finn Clark
* CIS - 12
* Hartman
* 10/7/23
* Assignment 5 */
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
/*This line of code has public as the access specifier, static as the access modifier, double as the return type and
* is named "convertF2K". This line of code also takes the variable "fahrenheit" as the only parameter with the data
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
        System.out.printf("%-36s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-3s : %26s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-3s : %26s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-3s : %26s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-3s : %7s%n", "Q).", "To quit");
        return input.nextLine();
    }
/*This block of code has the access specifier public, an access modifier of static and the return type is String. This
* object method is named "getUnitChoice". I know this is an object method because it has created the object "getUnitChoice"
* that is a memory reference and can be called on again from within the class. There are no parameters.
* The flow of execution for this block of code is that it is to spit out a bunch of formatted Strings. The formatting
* specifications are with the "%-4s" and the "%40s%n" which I've shortened further. These specifications mean
* that when printing these Strings to the console, it will plug in the first String after the comma for the first %s and
*  the second String after the comma for the second. The -4 and 40 are character specifications, where -4 means that it
*  will add as many spaces or padding as needed until the first String to be printed reaches 4 characters to the right
*  of the String, then a colon, and for the second String of characters it will have space for up to 40 characters to
*  the left to fit the "to convert a *...* temperature". They differ because we've only used decimal specifiers that
*  limit the amount of spaces or digits the int or double value will print to the console. Then return the input scanned
*  before the enter keystroke.*/
    public static void main(String[] args) {
        boolean shouldContinue = true; // This is setting the condition of the "while" statement true, I did this so I can have an exit after converting
        while(shouldContinue) {
            System.out.println("Please capitalize your selected unit");
            String unit = getUnitChoice(); //Referencing "String unit" parameter for getTemp(String unit) method
            switch (unit) {
                case "C": double tempC = getTemp(unit); //Assigning the double input for getTemp to be named "tempC"
                double cF = convertC2F(tempC); //Plugging in input and assigning to variable cF (Celsius -> Fahrenheit)
                double cK = convertC2K(tempC); //Plugging in input and assigning to variable cK (Celsius -> Kelvin)
                    System.out.printf("Result: %6f°C is %6f°F and %6f°K", tempC, cF, cK); //Formatted print String statement, took be a bit to figure out because I was using %d instead of %f
                    break; //Exit switch statement
                case "K": double tempK = getTemp(unit);// Assigning input to tempK
                    double kF = convertK2F(tempK);//Converting temp1 (Kelvin) to kF (Fahrenheit)
                    double kC = convertK2C(tempK);// Converting temp1 (Kelvin) to kC (Celsius)
                    System.out.printf("Result: %6f°K is %6f°F and %6f°C", tempK, kF, kC);
                    break;
                case "F": double tempF = getTemp(unit);//Assigning input to "tempF"
                    double fC = convertF2C(tempF);//Converting tempF (Fahrenheit) to fC (Celsius)
                    double fK = convertF2K(tempF);//Converting tempF (Fahrenheit to fK (Kelvin)
                    System.out.printf("Result: %6f°F is %6f°C and %6f°K", tempF, fC, fK);
                    break;
                case "Q": //If user types "Q", then will print following statement and break from switch
                    System.out.println("Quitting program");
                    break;
                default: //If no usable input is given, will print following statement
                    System.out.println("Incorrect input detected");
                    break;
            }shouldContinue = false; //After breaking from switch statement, setting "shouldContinue" to false for exiting
            System.out.printf("%nExiting program....");

            }

            }
        }
