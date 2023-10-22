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
    public static double convertK2F(double kelvin) {return convertC2F(convertK2C(kelvin));}

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

    public static String getUnitChoice2() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert to a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert to a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert to a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }



    public static void main(String[] args) {
        while(true) {

           switch (getUnitChoice()){
               case "C":
                   switch (getUnitChoice2()){
                       case "F":
                           double getTempCelsius = getTemp("celsius");
                          double getTempFCelsius =  convertC2F(getTempCelsius);
                           System.out.printf("Result %.6f°C is %.6f°F%n", getTempCelsius, getTempFCelsius);
                           //getTemp for celsius is made into a variable so that the result can be input into convertC2F
                           // and so the result of the original function can be put into the soutf function. convertC2F is
                           // made into a variable so I can get what's happening better
                           //Side note, I will have to do this for every one of these mini cases... Yay...

                           break;
                       case "C":
                           System.out.printf("Result is %.6f°C", getTemp("celsius"));
                           break;
                       case "K":
                           double getTempCKelvin = getTemp("kelvin");
                           double getTempCCKelvin = convertC2K(getTempCKelvin);
                           System.out.printf("Result %.6f°C is %.6f°K%n", getTempCKelvin, getTempCCKelvin);
                           break;
                       case "Q":
                           System.exit(0);
                           break;

                   }
                   break;



               case "F":
                   switch (getUnitChoice2()) {
                       case "F":

                           System.out.println(getTemp("fahrenheit"));
                       case "C":
                           double getTempFahrenheit = getTemp("fahrenheit");
                           double getTempCFahrenheit = convertF2C(getTempFahrenheit);
                           System.out.printf("Result %.6f°F is %.6f°C%n", getTempFahrenheit, getTempCFahrenheit);
                           break;
                       case "K":
                           double getTempFahrenheitAgain = getTemp("fahrenheit");
                           double getTempKFahrenheit = convertF2K(getTempFahrenheitAgain);
                           System.out.printf("Result %.6f°F is %.6f°K%n", getTempFahrenheitAgain, getTempKFahrenheit);
                           break;
                       case "Q":
                           System.exit(0);
                           break;
                   }
                   break;

               case "K":
                   switch (getUnitChoice2()) {
                       case "F":
                           double gTKelvin = getTemp("kelvin");
                           double gTFKelvin = convertK2F(gTKelvin);
                           System.out.printf("Result %.6f°K is %.6f°F%n", gTKelvin, gTFKelvin);
                           break;
                       case "C":
                           double gTKelvinA = getTemp("kelvin");
                           double gTCKelvin = convertK2C(gTKelvinA);
                           System.out.printf("Result %.6f°K is %.6f°C%n", gTKelvinA, gTCKelvin);

                           break;
                       case "K":
                           System.out.println(getTemp("kelvin"));
                           break;
                       case "Q":
                           System.exit(0);
                           break;
                   }
                   break;


               case "Q":

                   System.exit(0);
                   break;


               default:
                   throw new IllegalStateException("Unexpected value: " + getUnitChoice());
           }
/*
* Requests a temperature Unit to convert from ~~~
    * Requests a temperature Unit to convert to ~~~
    * Quits the program if Q is entered for either choice~~~
    * Requests the double temperature value to convert~~~
    * Uses a **switch** or **enhanced switch** conditional to call the proper ~~~
  conversion method.
    * Prints out the result as indicated below:

          Result 40.000000°C is 104.000000°F
 */


        }
    }
}