package homeworkweek7;

import java.util.Arrays;

/**
 *  This a program to sort a numeric array and a string array.
 */
public class Programme_17_SortArrays {
    public static void main(String[] args) {

        int[] num={9,24,36,75,4,100,54,5,78,7,6,8};                                                             // numeric array declaration
        String[] str={"Vishvesh", "Himanshu", "Ronak", "Kaushik ", "Sagar", "Aesha", "Kashyap", "Ameet"};       // string array declaration

//        Arrays.toString(num);
//        Arrays.toString(str);


        System.out.println(" Original Numeric Arrays : " + Arrays.toString(num));
        Arrays.sort(num);                                                           // sort numeric array statement
        System.out.println(" Sorted Numeric Arrays : " + Arrays.toString(num));

        System.out.println("");

        System.out.println(" Original String Arrays : " +Arrays.toString(str));
        Arrays.sort(str);                                                            // sort String array statement
        System.out.println(" Sorted String Arrays : " + Arrays.toString(str));

    }

}
