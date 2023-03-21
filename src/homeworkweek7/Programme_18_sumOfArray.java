package homeworkweek7;

import java.util.Arrays;

/**
 *  This program to sum values of an array.
 */
public class Programme_18_sumOfArray {
    public static void main(String[] args) {

        int my_array[] = {1,20,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        System.out.println("List of stored array values"+ Arrays.toString(my_array));
        System.out.println("");
        for (int i : my_array)
            sum += i;                               // Statement to sum the array value
        System.out.println("The sum is " + sum);
    }
}

