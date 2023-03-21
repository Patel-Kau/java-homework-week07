package homeworkweek7;

import java.util.Scanner;

/**
 * This program to test if an array contains a specific value
 */
public class Programme_20_ArrayCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                                        // Scanner object declaration
        System.out.print(" Enter the value to check it is contain in arrays : ");
        int tofind = sc.nextInt();

        boolean found = false;                                                      // Boolean variable declaration

        int[] numbers = new int[]{-20, 35, 27, 33, 76, 63, 120};                    // variable declaration for Numeric array

        // statement to check the number entered by user is in array list or not and store the result in "found" variable
        for (int n : numbers) {
            if (n == tofind) {
                found = true;
                break;
            }
        }

        // Statement to display the message according to the result stored in "found" variable
        if (found)
            System.out.println(tofind + " is found.");
        else
            System.out.println(tofind + " is not found");

    }
}

