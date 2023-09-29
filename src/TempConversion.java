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

            String resultTemplate = "Result %.6f°%s is %.6f°%s%n";
            String toUnit;
            String fromUnit;
            double tempVal;

            fromUnit = TempConversion.getUnitChoice();

            if (fromUnit.equalsIgnoreCase("Q")) {
                System.out.println("Goodbye");
                break;
            }

            switch (fromUnit) {

                case "F":
                    tempVal = TempConversion.getTemp(fromUnit);
                    toUnit = TempConversion.getUnitChoice();

                    if (toUnit.equalsIgnoreCase("Q")) {
                        fromUnit = toUnit;
                        break;
                    }

                    switch (toUnit) {

                        case "C":
                            System.out.printf(resultTemplate, tempVal, fromUnit, TempConversion.convertF2C(tempVal), toUnit);
                            break;

                        case "K":
                            System.out.printf(resultTemplate, tempVal, fromUnit, TempConversion.convertF2K(tempVal), toUnit);
                            break;
                    }
                break;

                case "C":
                    tempVal = TempConversion.getTemp(fromUnit);
                    toUnit = TempConversion.getUnitChoice();

                    if (toUnit.equalsIgnoreCase("Q")) {
                        fromUnit = toUnit;
                        break;
                    }

                    switch (toUnit) {

                        case "F":
                            System.out.printf(resultTemplate, tempVal, fromUnit, TempConversion.convertC2F(tempVal), toUnit);
                            break;

                        case "K":
                            System.out.printf(resultTemplate, tempVal, fromUnit, TempConversion.convertC2K(tempVal), toUnit);
                            break;
                    }
                break;

                case "K":
                    tempVal = TempConversion.getTemp(fromUnit);
                    toUnit = TempConversion.getUnitChoice();

                    if (toUnit.equalsIgnoreCase("Q")) {
                        fromUnit = toUnit;
                        break;
                    }

                    switch (toUnit) {

                        case "C":
                            System.out.printf(resultTemplate, tempVal, fromUnit, TempConversion.convertK2C(tempVal), toUnit);

                            break;
                        case "F":
                            System.out.printf(resultTemplate, tempVal, fromUnit, TempConversion.convertK2F(tempVal), toUnit);
                            break;
                    }
                    
                break;


            }

            if (fromUnit.equalsIgnoreCase("Q")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }
}