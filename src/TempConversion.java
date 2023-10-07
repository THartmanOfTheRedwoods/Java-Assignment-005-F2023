import java.util.Scanner;

public class TempConversion {
    static double fahrenheit;
    static double celsius;
    static double kelvin;
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
        getUnitChoice();
        String unit = input.nextLine();
        String celsius = "C";
        String fahrenheit = "F";
        String kelvin = "K";
        while(true) {
            switch(celsius) {
                case "F": getTemp(unit);
                    Double cF = Double.parseDouble(input.nextLine());
                    Double cK = convertC2F(cF);
                    System.out.printf("Result: %.6d : %.6d", cF, cK);
                    break;
                case "K": getTemp(unit);
                    Double celK = Double.parseDouble(input.nextLine());
                    Double celF = convertK2C(celK);
                    System.out.printf("Result: %.6d : %.6d", celK, celF);
                    break;
            }switch(fahrenheit){
                case "C": getTemp(unit);
                Double fC = Double.parseDouble(input.nextLine());
                Double farC = convertF2C(fC);
                    System.out.printf("Result: %.6d : %.6d", fC, farC);
                    break;
                case "K": getTemp(unit);
                Double fK = Double.parseDouble(input.nextLine());
                Double farK = convertF2K(fK);
                    System.out.printf("Result: %.6d : %.6d", fK, farK);
                    break;
            }switch(kelvin) {
                case "F": getTemp(unit);
                Double kF = Double.parseDouble(input.nextLine());
                Double kelF = convertK2F(kF);
                    System.out.printf("Result: %.6d : %.6d", kF, kelF);
                    break;
                case "C": getTemp(unit);
                Double kC = Double.parseDouble(input.nextLine());
                Double kelC = convertK2C(kC);
                    System.out.printf("Result: %.6d : %.6d", kC, kelC);
                    break;
            }
            }
        }
    }
