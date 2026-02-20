package LAB_6;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Change case & reverse5T
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Change case: " + s.toUpperCase());
        System.out.println("Reverse: " + new StringBuilder(s).reverse());

        // Compare
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println("ASCII difference: " + s.compareTo(s2));

        // Insert
        System.out.print("Enter string to insert: ");
        String ins = sc.nextLine();
        System.out.println("After insertion: " + s + " " + ins);

        // Character check
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int pos = s.indexOf(ch);
        if (pos == -1)
            System.out.println("Character not present");
        else
            System.out.println("Position: " + pos);

        // Palindrome
        String rev = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        // Word, vowel, consonant count
        String[] words = s.split(" ");
        int v = 0, c = 0;

        for (char ch1 : s.toCharArray()) {
            if (Character.isLetter(ch1)) {
                if ("aeiouAEIOU".indexOf(ch1) != -1) v++;
                else c++;
            }
        }

        System.out.println("Words: " + words.length);
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}
