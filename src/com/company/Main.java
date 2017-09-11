package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numOne = new Scanner(System.in);
        String userInput = numOne.nextLine();
        String userInput2 = numOne.nextLine();
        double operan1 = Double.parseDouble(userInput);
        double operan2 = Double.parseDouble(userInput2);
        double sum = operan1 + operan2;
        double less = operan1 - operan2;
        double div = operan1 / operan2;
        double mult = operan1 * operan2;
        double rem = operan1 % operan2;
        showResults(sum, less, div, mult, rem);

    }
    static void showResults(double add, double sub, double slice, double times, double left) {
        System.out.println(add);
        System.out.println(sub);
        System.out.println(slice);
        System.out.println(times);
        System.out.println(left);
    }
}





//    In the main method of Main.java class:
//
//        Ask the user to input two numbers
//        Get the numbers as Strings using Scanner
//        Convert a String to a double using Double.parseDouble. Save the the first double value in an operand1 variable
//        and the second double value in an operand2 variable
//        Add the operands and save in a sum variable
//        Subtract the operands and save in a difference variable
//        Divide the operands and save in a division variable
//        Multiple the operands and save in a multiplication variable
//        Find the remainder when one operand is divided by the other and save in a remainder variable. See this page if you need to learn more about the remainder operator.
//        Call a showResults method and pass the sum, difference, division, multiplication and remainder variables as arguments.
//        In the showResults method output the parameters with some meaningful text (e.g. The sum is 10.5).
