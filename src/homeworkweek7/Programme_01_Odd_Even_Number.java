package homeworkweek7;
/**
 * The java program that tells that input number is odd or even.
 */

import java.util.Scanner;

public class Programme_01_Odd_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                    // Scanner declaration
        System.out.print("Enter the Input Number : ");
        int num = sc.nextInt();
        Programme_01_Odd_Even_Number obj = new Programme_01_Odd_Even_Number(); // object created
        obj.calculation(num);                                                   // Instance method called
        sc.close();                                                              // scanner closed
    }

    public void calculation(int num) {

        String a = (num % 2 == 0) ? "Enter number is Even" : "Entered number is Odd"; // Ternary operator
        System.out.println(a);
    }
}
