# Java-Assignment-005 - Switch it Up

## Part 1: - Tracing the Code
As a new Java developer, you will be required to familiarize yourself with existing code before beginning to develop. That's what this section is about, developing your code tracing skills and familiarizing yourself with parts you may be able to use.
* Scan through all the existing code and note what you have to work with.
    * Method names: ihave 8 methods including the main
    * Variables
* Using Java terminology, break down every piece of the method **convertF2K**.
    * What is the access modifier? Public
    * Is it a class or object method, how do you know? because its public static know that it is a class method
    * What is its return type? double
    * What parameters does it require, and what are the parameter(s) datatype(s)? it requires 1 double 
    * Describe for me how the body of the method executes (i.e. its flow of execution). It converts fahrenheit to celsius using converF2c and then it takes that and it calls covert C2k to get it in Kelvin and then it returns the temp in Kelvin 
* Using Java terminology, break down method **getUnitChoice**.
    * What is the access modifier?public
    * Is it a class or object method, how do you know? method because it is public static 
    * What is its return type? string
    * What parameters does it require, and what are the parameter(s) datatype(s)? it doesnt require any
    * Describe for me how the body of the method executes (i.e. its flow of execution). It inputs a way for the user to make a choice between what type of conversion they want for temp or if they want to quit and each line represnts one of those options, after promting that it reads the user's choice
    * How do the format specifiers differ than what you've seen before and what do they do?  %s is a placeholder for a string which i have seen %n is a newline character which i have seen %-40s is new to me and it helps allign the output with a left justified string with a widt of 40 char

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
