package LAB_8;

import java.io.*;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            int characters = 0, words = 0, lines = 0;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += w.length;
                }
            }

            br.close();

            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}