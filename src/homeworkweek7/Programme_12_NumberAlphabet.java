package homeworkweek7;

import java.util.Scanner;

/**
 * This program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_NumberAlphabet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        // Scanner object declaration

        System.out.print("Enter the Any input : ");
        String input = sc.next();                   // Store the input in to the variable
        char input1 = input.charAt(0);              //  store the first character of the input in to variable

        sc.close();                                 //  Stop the Scanner
        sorter(input1);                             // Static method called

    }

    public static void sorter(char input1){             // Static method

        // Conditional Statement to display output according to the input

        if (input1>='a' && input1 <='z' || input1>='A' && input1 <='Z' ){
            System.out.println(input1+ " is a Alphabet");

        } else if (input1>='0' && input1 <='9') {
            System.out.println(input1 + " is a Number");
        }else{
            System.out.println(input1 + " is a Symbol");
        }
    }


}
