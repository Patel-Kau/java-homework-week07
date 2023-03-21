package homeworkweek7;

import java.util.Scanner;

/**
 * This program to input any two number and ask user to enter their symbol (+, -, * /, *).
 * Find addition, Subtraction, multiplication and division according to their symbol by using if else statement.
 */
public class Programme_10_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                     // Scanner object declaration

        System.out.print(" Enter the first number : ");
        float num1 = sc.nextFloat();                            // Stored user entered value in variable

        System.out.print(" Enter the second number : ");
        float num2 = sc.nextFloat();                            // Stored user entered value in variable

        System.out.print(" Enter the symbol : ");
        String symbol = sc.next();                              // Stored user entered value in variable
        sc.close();                                             // Scanner closed

        Programme_10_Calculator obj = new Programme_10_Calculator();  // Objected created
        obj.calculation(num1, num2, symbol);
    }

    public void calculation(float num1, float num2, String symbol) {            // Method for calculation

        float answer;       // Variable declaration

        // Statement to select output according to the input value

        if (symbol.equals("+")) {
            answer = num1 + num2;
            System.out.println("Your Answer is " + answer);
        } else if (symbol.equals("-")) {
            answer = num1 - num2;
            System.out.println("Your Answer is " + answer);
        } else if (symbol.equals("*")) {
            answer = num1 * num2;
            System.out.println("Your Answer is " + answer);
        } else if (symbol.equals("/")) {
            answer = num1 / num2;
            System.out.println("Your Answer is " + answer);
        } else {
            System.out.println("Invalid Symbol");
        }

    }


}


