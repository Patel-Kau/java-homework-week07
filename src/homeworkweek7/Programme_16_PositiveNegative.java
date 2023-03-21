package homeworkweek7;

import java.util.Scanner;

/**
 * This program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 *
 */
public class Programme_16_PositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);            // Scanner object declaration
        System.out.print("Enter the number to check enter number is \"POSITIVE,\" \"NEGATIVE\" OR \"ZERO\": ");
        int input = sc.nextInt();

        sc.close();                                                                 // Stop Scanner
        Programme_16_PositiveNegative obj = new Programme_16_PositiveNegative();    // Object declaration
        obj.positivenegative(input);                                                // Instance method called
    }

    public void positivenegative(int input){

                // Statement to select the output according to the input value
        if (input > 0) {
            System.out.println(input + " Number is POSITIVE ");
        } else if (input < 0) {
            System.out.println(input + " Number is NEGATIVE ");
        } else {
            System.out.println(input + " Number is ZERO ");
        }

    }
}
