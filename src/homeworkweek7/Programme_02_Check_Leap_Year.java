package homeworkweek7;

import java.util.Scanner;

/**
 * The java program to input any year and find out if it is leap year or not.
 */


public class Programme_02_Check_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                        // Scanner declaration
        System.out.print("Enter the year to find out is it Leap year or not : ");
        int year = sc.nextInt();
        sc.close();                                                                 // Scanner closed
        Programme_02_Check_Leap_Year obj = new Programme_02_Check_Leap_Year();      // Object declaration
        obj.leapYear(year);                                                         // Instance method called
    }

    public void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {                                     // Leap year calculation
            System.out.println(year + " Year is leap year ");
        } else {
            System.out.println(year + " Year is not Leap Year");
        }
    }
}