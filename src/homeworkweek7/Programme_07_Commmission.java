package homeworkweek7;

import java.util.Scanner;

/**
 * This programme is for commission calculation
 */
public class Programme_07_Commmission {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                // Scanner object created

        System.out.print("Saller's Name : ");
        String sallername = sc.nextLine();

        System.out.print("Sales ID : ");
        int salesid = sc.nextInt();

        System.out.print("Sales Amount : ");
        float salesamount = sc.nextFloat();

        System.out.print("Salary Basic : ");
        float salarybasic = sc.nextFloat();

        sc.close();                                     // Scanner closed
        calculation(salesamount, salarybasic);          // Static method Calculation is called

    }
    public static void calculation(float salesamount, float salarybasic) {

        float commission;                   // Variable declaration

        // Commission calculation

        if (salesamount >= 50000) {
            commission = ((salesamount * 35) / 100);
        } else if (salesamount >= 30000) {
            commission = ((salesamount * 20) / 100);
        } else if (salesamount >= 20000) {
            commission = ((salesamount * 10) / 100);
        } else if (salesamount >= 10000) {
            commission = ((salesamount * 5) / 100);
        } else {
          commission = ((salesamount * 2) / 100);
        }
        System.out.println( "Commission : " + commission);
        float totalsalary = salarybasic + commission;
        System.out.println(" Total Salary with Commission : " + totalsalary);
    }

}
