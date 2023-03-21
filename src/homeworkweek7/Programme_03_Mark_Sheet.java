package homeworkweek7;

import java.util.Scanner;

/**
 * The java programme to create and calculate grade & percentage in mark sheet
 * Input Student name, Roll No. and Three subject Maths, Science and English marks.
 * Input should be between 0-100 marks, If it is out of range print error message"Invalid input, Mark should between 0 to 100.
 * Find out percentage and result.
 * Grade if % >= 80 A+, % >= 60 A, % >= 50 B, %>= 35 C and print mark sheet in following format
 * | -------------------------------|
 * |            Mark Sheet         |
 * |_______________________________|
 * | Name       :       Jay        |
 * | Roll No    :       08         |
 * |_______________________________|
 * | Subjects   : Marks            |
 * |_______________________________|
 * | Math       : 98              |
 * | Science    : 90              |
 * | English    : 85              |
 * |_______________________________|
 * | Total      : 273 |
 * |_______________________________|
 * | Percentage  : 91.0           |
 * | Result      : Pass           |
 * | Grade       : A+             |
 * |_______________________________
 */
public class Programme_03_Mark_Sheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Scanner object declaration

        System.out.print("Enter the Student name : ");
        String student = sc.nextLine();

        System.out.print("Enter the Student roll number : ");
        int rollno = sc.nextInt();

        int maths;
//        do {
        System.out.print("Enter the Maths Marks : ");
        maths = sc.nextInt();
//        }
//      while (maths > 100 || maths < 0);

        System.out.print("Enter the Science Marks : ");
        int science = sc.nextInt();

        System.out.print("Enter the English Marks : ");
        int english = sc.nextInt();

        sc.close();                                                     // Stop Scanner
        Programme_03_Mark_Sheet obj = new Programme_03_Mark_Sheet();    // Object created
        obj.calculation(maths, science, english, rollno, student);      // Instance method called
    }

    public void calculation(int maths, int science, int english, int rollno, String student) {

                // Statement to fix mark range between 0 and 100 for Maths, Science and English
        if (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Enter mark Between 0 to 100");

        } else {

            String result = (maths < 35 || science < 35 || english < 35) ? "Fail" : "PASS";

            System.out.println(result);

            // Total marks and percentage calculation statements
            float total = maths + science + english;
            float percentage = ((maths + science + english) / 3);
            System.out.println(" Total percentage : " + percentage);

            String grade;

            // Statement to display grade according to the percentage
            if (percentage >= 80) {
                grade = "A+";
            }else if (percentage < 80 && percentage >= 60) {
                grade = "A";
            }else if (percentage < 60 && percentage >= 50) {
                grade = "B";
            }else if (percentage < 50 && percentage >= 35) {
                grade = "C";
            }else {
                grade = "Invalid";
            }

            // Mark sheet Printing
            System.out.println("_____________________________________________");
            System.out.println("|                                            |");
            System.out.println("|              Mark Sheet                    |");
            System.out.println("|____________________________________________|");
            System.out.println("|     Name        :         " + student + "          |");
            System.out.println("|     Roll No     :         " + rollno + "              |");
            System.out.println("|____________________________________________|");
            System.out.println("|     Subject     :          Marks           |");
            System.out.println("|____________________________________________|");
            System.out.println("|      Maths      :          " + maths + "              |");
            System.out.println("|      Science    :          " + science + "              |");
            System.out.println("|      English    :          " + english + "              |");
            System.out.println("|____________________________________________|");
            System.out.println("|      Total      :         " + total + "            |");
            System.out.println("|____________________________________________|");
            System.out.println("|     Percentage  :        "  + percentage + "              |");
            System.out.println("|     Result      :        " + result + "              |");
            System.out.println("|     Grade       :         " + grade + "                |");
            System.out.println("|____________________________________________|");

        }
    }
}
