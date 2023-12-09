# Java-Assignment-005 - Switch it Up

## Part 1: - Tracing the Code
As a new Java developer, you will be required to familiarize yourself with existing code before beginning to develop. That's what this section is about, developing your code tracing skills and familiarizing yourself with parts you may be able to use.
* Scan through all the existing code and note what you have to work with.
    * Method names
  getUnitChoice, main, getTemp
    * Variables
 celsius, input, fahrenheit
* Using Java terminology, break down every piece of the method **convertF2K**.
    * What is the access modifier? 
       public
    * Is it a class or object method, how do you know?
       A class method, because it is static.
    * What is its return type? 
       Its return type is double.
    * What parameters does it require, and what are the parameter(s) datatype(s)?
       Asking for a temperature with the datatype double.
    * Describe for me how the body of the method executes (i.e. its flow of execution).
It converts Fahrenheit to Celsius and converts Celsius to Kelvin. Our result is the temperature in Kelvin.
* Using Java terminology, break down method **getUnitChoice**.
    * What is the access modifier?
  Public
    * Is it a class or object method, how do you know?
  Class because it is static. 
    * What is its return type?
  String
    * What parameters does it require, and what are the parameter(s) datatype(s)?
  No parameters.
    * Describe for me how the body of the method executes (i.e. its flow of execution).
  prompts user to select a temperature unit or quit the program. It then reads input and returns input as a string and user input.
    * How do the format specifiers differ than what you've seen before and what do they do?
I was not familiar with %-4. It seems the - is for left-justification and the 4 is setting a minimum width of the field. 
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
