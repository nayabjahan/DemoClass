package com.brdz.javapractice;

public class Calculate {
    int num1 = 19, num2 = 4;  //Declare and initialize the numbers

    public void calculateResult() {
        System.out.println("The entered number is: " + num1);
        System.out.println("The entered number is: " + num1);
        //Find quotient
        int quotient = num1 / num2;

        //Find Remainnder
        int remainder = num1 % num2;
        System.out.println("After division the quotient and remainder are: ");

        //Print the quotient and remainder
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
}
