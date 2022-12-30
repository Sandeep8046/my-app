package com.mycompany.app;

import java.util.Scanner;

public class App
{
  public static int add(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }
  public static int subtract(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }
  public static int multiply(int multiplicand, int multiplier) {
    return multiplicand * multiplier;
  }

  public static int divide(int dividend, int divisor) {
    if (divisor == 0)
      throw new IllegalArgumentException("Cannot divide by zero (0).");

    return dividend / divisor;
  }
  public static void main( String[] args ) {
		int firstNumber,secondNumber;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter 1st number");
	firstNumber = in.nextInt();
			
	System.out.println("Enter 2nd Number:");
	secondNumber = in.nextInt();
	
	System.out.println("Sum = "+(firstNumber + secondNumber));
	System.out.println("Subtraction = "+(firstNumber - secondNumber));
	System.out.println("Multiplication = "+(firstNumber * secondNumber));
	System.out.println("Division = "+(firstNumber / secondNumber));
}

}

