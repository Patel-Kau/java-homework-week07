package homeworkweek7;

import java.util.Arrays;

/**
 * This  program to calculate the average value of array elements.
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {

        int[] numbers = new int[]{-20, 35, 27, 33, 76, 63, 120};

        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];

        //calculate average value
        double average = sum / numbers.length;
        System.out.println("List of stored array values"+ Arrays.toString(numbers));
        System.out.println("");
        System.out.println("Average value of the array elements is : " + average);

    }
}
