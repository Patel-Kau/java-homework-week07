package homeworkweek7;

import java.util.Scanner;

/**
 * This programme is for to identify the entered number by user is Odd or Even
 */
public class Programme_06_OddEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input Number : ");
        int num = sc.nextInt();                             // Scanned value stored in a variable

        sc.close();                                         // Scanner closed

       calculation(num);                                    // Static method called
    }

    public static void calculation(int num) {

        if (num % 2 == 0) {                                     // formula to identify odd or even number
            System.out.println("Enter number is Even");
        }else {
            System.out.println("Entered number is Odd");
        }
    }
}



