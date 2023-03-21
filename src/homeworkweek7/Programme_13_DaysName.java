package homeworkweek7;

import java.util.Scanner;

/**
 * This program which input any number between 1 to 7.
 * It print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * If number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme_13_DaysName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //Scanner object declaration
        System.out.print("Enter the number between 1 to 7 : ");
        int input = sc.nextInt();               // Stored the input in to the variable

        sc.close();                             // Stop the Scanner
        week(input);                            // static method called
    }

    public static void week(int input){

        // Conditional Statement to display output according to the input

        switch (input){
            case 1:
                System.out.println(" MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }


    }
}
