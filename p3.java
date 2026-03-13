package LAB_7;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

public class p3 {

    static void ProcessInput(int n) throws NegativeNumberException {
        if (n < 0) throw new NegativeNumberException("number should be positive");
        System.out.println("Double value: " + (2 * n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            ProcessInput(n);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
