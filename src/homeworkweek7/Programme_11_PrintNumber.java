package homeworkweek7;

/**
 * This program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme_11_PrintNumber {
    public static void main(String[] args) {
        int n = 3;                  // Local variable
        int a = 5;                  // Local variable
        Programme_11_PrintNumber obj = new Programme_11_PrintNumber();      // Object declaration
        System.out.println("Print the number Divided by 3 between 1 - 100");
        obj.printNum(n);                                                    // Method calling
        System.out.println("");                                             // Blank line print to make space between two lines
        System.out.println("");                                             // Blank line print to make space between two lines
        System.out.println("Print the number Divided by 5 between 1 - 100");
        obj.calculation(a);                                                 // Method calling
    }

    public void printNum(int n) {                                     //  Instance method
        if (n <= 100) {                                               // Condition to check variable n value is <=100
            System.out.print(n + ", ");                               // Print the result
            printNum(n + 3);                                       // Add 3 in to the result
        }

    }

    public void calculation(int a) {
        if (a <= 100) {                                                 // Condition to check variable n value is <=100
          System.out.print(a + ", ");                                   // Print the result
            calculation(a + 5);                                      // Add 5 in to the result
        }
    }
}
