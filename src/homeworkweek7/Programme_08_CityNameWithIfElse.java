package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly by using if else statement.
 * If any other alphabet should be invalid entry.
 */
public class Programme_08_CityNameWithIfElse {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println(" Enter Any alphabet from A to F : ");
        String city = read.next();
        char cityname = city.toUpperCase().charAt(0);         // convert text from lowercase to uppercase and store first character in variable

        cityName(cityname);                                  // Method called
        read.close();                                       // Scanner closed
    }

    public static void cityName(char cityname) {            // Method to display the city name as per character entered by user

        // conditional statement to display output related to the input value

        if (cityname == 'A') {
            System.out.println(" Ahmedabad ");
        } else if (cityname == 'B') {
            System.out.println(" Bristol ");
        } else if (cityname == 'C') {
            System.out.println(" Cambridge ");
        } else if (cityname == 'D') {
            System.out.println(" Dagenham ");
        } else if (cityname == 'E') {
            System.out.println(" Edmonton");
        } else if (cityname == 'F') {
            System.out.println(" France ");
        } else {
            System.out.println("Invalid alphabet ");
        }


    }

}
