package LAB_8;

import java.io.*;
import java.util.Scanner;

public class p2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter source file name: ");
            String source = sc.nextLine();

            System.out.print("Enter destination file name: ");
            String dest = sc.nextLine();

            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fout = new FileOutputStream(dest);

            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }

            fin.close();
            fout.close();

            System.out.println("File Copied");

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}