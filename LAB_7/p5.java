package LAB_7;

import java.util.Scanner;

class CheckArgument extends Exception {
    public CheckArgument(String msg) {
        super(msg);
    }
}

public class p5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of values: ");
            int n = sc.nextInt();

            if (n < 4) {
                throw new CheckArgument("CheckArgument");
            }

            int sum = 0;
            System.out.println("Enter 4 numbers:");

            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                sum += x * x;
            }

            System.out.println(sum);

        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }

        sc.close();
    }
}
