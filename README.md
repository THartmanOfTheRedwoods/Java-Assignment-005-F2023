# Java-Assignment-005 - Switch it Up

## Part 1: - Tracing the Code
As a new Java developer, you will be required to familiarize yourself with existing code before beginning to develop. That's what this section is about, developing your code tracing skills and familiarizing yourself with parts you may be able to use.
* Scan through all the existing code and note what you have to work with.
    * Method names
  -TempConversion
  -Scanner
  -convertC2F
  -convertC2K
  -convertF2C
  -convertF2K
  -convertK2C
  -getTemp
  -getUnitChoice
  -main
    * Variables
  - celsius
  - kelvin
  - fahrenheit
* Using Java terminology, break down every piece of the method **convertF2K**.
    * What is the access modifier? Public
    * Is it a class or object method, how do you know? "Static" makes this a class method, so we don't need to create a new object to call it. (I think?)
    * What is its return type? Double
    * What parameters does it require, and what are the parameter(s) datatype(s)?  It is asking for a temperature in fahrenheits with the datatype double.
    * Describe for me how the body of the method executes (i.e. its flow of execution). Okay so it takes a degree in F and converts it to C by calling the method convertF2C. Then it takes that celsius value and calls method convert C2K, passing the value we just got from F2C to get an answer in Kelvin. It then returns (or stores) that Kelvin value.
* Using Java terminology, break down method **getUnitChoice**.
    * What is the access modifier? Public
    * Is it a class or object method, how do you know? Class method, because "static."
    * What is its return type? String
    * What parameters does it require, and what are the parameter(s) datatype(s)? There are no parameters set.
    * Describe for me how the body of the method executes (i.e. its flow of execution). It looks like it will print the four statements from top to bottom, and then wait for the user to input something. Once the user hits enter and we get that newline character the value is returned, so I think that means it's stored at that point?
    * How do the format specifiers differ than what you've seen before and what do they do? There are numbers in the string formatters! I had to google for this: %-4s but it seems that the - means left-justify, and the 4 is setting a minimum width which means it will get left-padded by zeros until it reaches four digits? Similarly the %40s will left-pad zeros until it reaches 40 digits?   

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
