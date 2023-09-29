# Java-Assignment-005 - Switch it Up

## Part 1: - Tracing the Code
As a new Java developer, you will be required to familiarize yourself with existing code before beginning to develop. That's what this section is about, developing your code tracing skills and familiarizing yourself with parts you may be able to use.* Scan through all the existing code and note what you have to work with.
* Method names
  * `convertC2F`, `convertC2K`, `convertF2C`, `convertF2K`, `convertK2C`, `getTemp`, `getUnitChoice`, and of course, the `main` method.
* Variables
  * `input`, `celsius`, `fahrenheit`, `kelvin`, and `unit`
* Using Java terminology, break down every piece of the method **convertF2K**.
  *   The access modifier the `convertF2K` method is `public`, so it can be accessed from outside the class. I know `convertF2K` is a class method because of the `static` token in the method signature. The `static` token identifies the method as belonging to the class. Instances of the `TempConversion` class will not create the static class methods. Both the return and parameter are a `double` type.* The flow of execution goes a little something like this: When called, a `double` variable named `fahrenheit` is passed through the `convertF2K` method. First, the `convertC2K` method is called. Right before a value is passed through `convertC2K`, the `convertF2C` method is called, and `fahrenheit` is passed through it. The return `double` type represents a Celsius value that is then passed through the waiting `convertC2K` method, which in turn returns a `double` type value. This value is then returned by the `convertF2K` method.
* Using Java terminology, break down method **getUnitChoice**.
  * The access modifier in the `getUnitChoice` method signature is `public`. The `getUnitChoice` method is an object method. I can tell this by the absence of the `static` token in the method signature, as well as the `input` variable being accessed without calling the `TempConversion` class. The return type is `String`. The `getUnitChoice` method doesn't require a parameter.* The flow of execution starts with the `getUnitChoice` getting called. Each of the four `printf` commands are executed, displaying their strings. After printing the possible options to the user, the user's selection is assigned to the `input` variable and returned. I didn't get too far into the format specifiers, because I hadn't seen these before. Where the previous assignment involved format specifiers that substituted strings like an ad lib, these format specifiers deal with alignment. Neato
## Part 2: - Implement Missing Method: convertK2F
This Part is aimed at teaching you to use methods and code you have to add new functionality to existing code. In this case you will add the missing conversion method, but you don't need to know math :-)
* Hint: You can use existing methods!

## Part 3: - Switch it Up
Part 3 is all about learning how to use the **switch** conditional statement, or the **enhanced switch** statement. You've learned about **if/else** now you will learn about **switch**.
* Using the provided method and class variables, write a program in the **while** loop of the **main** method that:
    * Requests a temperature Unit to convert from
    * Requests a temperature Unit to convert to
    * Quits the program if Q is entered for either choice
    * Requests the double temperature value to convert
    * Uses a **switch** or **enhanced switch** conditional to call the proper conversion method.
    * Prints out the result as indicated below:

          Result 40.000000°C is 104.000000°F

## Part 4: Pull Request
Part 4, as usual, is repetition of duties you will be doing in industry.
* Make sure to use the Git tab at the bottom of IntelliJ to create a Feature1 feature branch
* Commit and Push your running code back to your GitHub account
* Issue a Pull request back to my Java-Assignment-005 repo
* Cut and Paste the Pull request URL into your Canvas assignment to turn it in.
