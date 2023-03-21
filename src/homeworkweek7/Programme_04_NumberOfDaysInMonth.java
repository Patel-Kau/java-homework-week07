package homeworkweek7;
/**
 * This programme to check entered year by the user is Leap year or not.
 * This programme also check the days of the entered month number
 *
 */

import java.util.Scanner;

public class Programme_04_NumberOfDaysInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // Scanner declaration
        System.out.print(" Enter year between 1 to 9999 : ");
        int year = sc.nextInt();

        System.out.print(" Enter month between 1 to 12 : ");
        int month = sc.nextInt();
        sc.close();

        System.out.println("");
        isLeapYear(year);                                           // Leap year method called
        System.out.println("");
        getDaysInMonth(year, month);                                // Days in month calculation method called
    }
    public static void isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {                                        //Leap year calculation formula
                System.out.println(year + " year is Leap year ");
            } else {
                System.out.println(year + " year is not leap year");
            }
        } else {
            System.out.println("Invalid data, since the parameter year is not in the range (1-9999)");
        }
    }

    public static void getDaysInMonth(int year, int month){                 // Method for days in a month display
        if (year >= 1 && year <= 9999) {
        switch (month) {
            case 1:
                System.out.println(" 31 Days in January  " + year);
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("29 Days in February " + year);
                } else {
                    System.out.println("28 Days in February " + year);
                }
                break;

            case 3:
                System.out.println(" 31 Days in March " + year);
                break;

            case 4:
                System.out.println(" 30 Days in April " + year);
                break;
            case 5:
                System.out.println(" 31 Days in May " + year);
                break;

            case 6:
                System.out.println(" 30 Days in June " + year);
                break;

            case 7:
                System.out.println(" 31 Days in July " + year);
                break;
            case 8:
                System.out.println(" 31 Days in August " + year);
                break;

            case 9:
                System.out.println(" 30 Days in September " + year);
                break;
            case 10:
                System.out.println(" 31 Days in October " + year);
                break;

            case 11:
                System.out.println(" 30 Days in November " + year);
                break;
            case 12:
                System.out.println(" 31 Days in December " + year);
                break;
            default:
                System.out.println("Enter Valid month number between 1 to 12 ");
        }
        } else {
        }
        }

//
//        if (month ==1){
//            System.out.println(" 31 Days in January  " + year);
//
//        } else if (month == 2) {
//                if(year % 4 ==0 ){
//                    System.out.println("29 Days in February "+ year);
//                }else {
//                    System.out.println("28 Days in February " + year);
//                }
//        } else  if (month ==3){
//            System.out.println(" 31 Days in March " + year);
//        } else  if (month ==4){
//            System.out.println(" 30 Days in April " + year);
//        } else  if (month == 5){
//            System.out.println(" 31 Days in May " + year);
//        } else  if (month ==6){
//            System.out.println(" 30 Days in June " + year);
//        } else  if (month ==7){
//            System.out.println(" 31 Days in July " + year);
//        } else  if (month ==8){
//            System.out.println(" 31 Days in August " + year);
//        } else  if (month ==9){
//            System.out.println(" 30 Days in September " + year);
//        } else  if (month ==10){
//            System.out.println(" 31 Days in October " + year);
//        } else  if (month ==11){
//            System.out.println(" 30 Days in November " + year);
//        } else if (month ==12) {
//            System.out.println(" 31 Days in December "+ year);
//        } else {
//            System.out.println("Enter Valid month number ");
//            }


    }

