package LAB_7;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4]; // suppose array size is 4
        System.out.println("Enter the numbers:");

        try {
            for (int i = 0; i < 5; i++) { // intentionally 5 inputs -> exception at i=4
                a[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }

        sc.close();
    }
}
