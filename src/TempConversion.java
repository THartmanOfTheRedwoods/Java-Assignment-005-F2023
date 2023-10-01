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

    public static double convertK2F(double kelvin) { double celsius = convertK2C(kelvin);
        return convertC2F(celsius);
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
                    System.out.println("Please choose a temperature unit to convert from:");
                    String fromUnit = getUnitChoice();
                    if (fromUnit.equalsIgnoreCase("Q")) {
                        System.out.println("Thank you for using this program. Goodbye!");
                        break;
                    }
                    System.out.println("Please choose a temperature unit to convert to:");
                    String toUnit = getUnitChoice();
                    if (toUnit.equalsIgnoreCase("Q")) {
                        System.out.println("Thank you for using this program. Goodbye!");
                        break;
                    }
                    double temp = getTemp(fromUnit);
                    double result = 0.0;
                    switch (fromUnit + toUnit) {
                        case "CF" -> result = convertC2F(temp);
                        case "CK" -> result = convertC2K(temp);
                        case "FC" -> result = convertF2C(temp);
                        case "FK" -> result = convertF2K(temp);
                        case "KC" -> result = convertK2C(temp);
                        case "KF" -> result = convertK2F(temp);
                        default -> System.out.println("Invalid choice. Please try again.");
                    }
                    System.out.printf("Result %.6f°C is %.6f°F%n", temp, result);
                }
            }


        }
