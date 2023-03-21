package homeworkweek7;

import java.util.Scanner;

/**
 * This programme is for to calculate and display salary slip
 */
public class Programme_05_SalarySlip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Name : ");
        String empname = sc.nextLine();

        System.out.print("Employee ID : ");
        int empid = sc.nextInt();

//        System.out.print("Employee Name : ");
//        String empname = sc.nextLine();

        System.out.print("Basic Salary : ");
        float basicsalary = sc.nextFloat();
        sc.close();

        calculation(empid, empname, basicsalary);  // Static method called


    }

    public static void calculation(int empid, String empname, float basicsalary) {          // This method is for salary calculation and Salary slip
        float hra = ((basicsalary * 10) / 100);
        float da = ((basicsalary * 8) / 100);
        float ta = ((basicsalary * 9) / 100);
        float pf = ((basicsalary * 20) / 100);
        float grosssalary = basicsalary + hra + ta + da - pf;

        System.out.println(" ___________________________________________");
        System.out.println("|             Salary Slip                   |");
        System.out.println("|___________________________________________|");
        System.out.println("|    Employee ID          : " + empid + "     |");
        System.out.println("|    Employee Name        : " + empname + "      |");
        System.out.println("|______________________________________________|");
        System.out.println("|    Basic Salary         : " + basicsalary + "    |");
        System.out.println("|    HRA 10%              : " + hra + "              |");
        System.out.println("|    TA 9%                : " + ta + "               |");
        System.out.println("|    DA 8%                : " + da + "               |");
        System.out.println("|    PF -20%              : " + pf + "              |");
        System.out.println("|___________________________________________________|");
        System.out.println("|    Gross Salary         : " + grosssalary + "       |");
        System.out.println("|_____________________________________________________|");


    }

}
