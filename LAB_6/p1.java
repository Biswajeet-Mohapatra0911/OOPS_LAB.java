package LAB_6;

import Marketing.Sales;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name ");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.print("Enter the basic salary ");
        double basic = sc.nextDouble();

        Sales s = new Sales(id, name);

        double total = s.earnings(basic);   // ONLY earnings formula

        System.out.println("The emp id of the employee is " + s.getEmpid());
        System.out.println("The total earning is " + total);
    }
}

