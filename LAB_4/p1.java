package LAB_4;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        // Input second string
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        // Input first substring
        System.out.println("Enter first substring:");
        String sub1 = sc.nextLine();

        // Input second substring
        System.out.println("Enter second substring:");
        String sub2 = sc.nextLine();

        // Check if substrings are present
        boolean check1 = str1.contains(sub1);
        boolean check2 = str2.contains(sub2);

        if (check1 && check2) {
            String result = str1.concat(str2);
            System.out.println("Both substrings are present.");
            System.out.println("Concatenated String: " + result);
        } else {
            System.out.println("Substring condition not Satisfied.");
        }

        sc.close();
    }
}
