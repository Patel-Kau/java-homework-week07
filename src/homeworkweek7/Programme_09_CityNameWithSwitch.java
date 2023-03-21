package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly by using switch statement.
 * If any other alphabet should be invalid entry.
 */
public class Programme_09_CityNameWithSwitch {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);      // Scanner object declaration

        System.out.println(" Enter Any alphabet from A to F : ");
        String city = read.next();
        char cityname = city.toUpperCase().charAt(0);

        read.close();           // Stop the Scanner
        name(cityname);         // static method called



    }
    public static void name(char cityname){

        // Switch statement to select output according to the input

        switch (cityname){
            case 'A':
                System.out.println(" Ahmedabad");
                break;
            case 'B':
                System.out.println("Bristol");
                break;
            case 'C':
                System.out.println("Cambridge");
                break;
            case 'D':
                System.out.println("Dagenham");
                break;
            case 'E':
                System.out.println("Edmonton");
                break;
            case 'F':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Alphabet");
            }
        }


    }
