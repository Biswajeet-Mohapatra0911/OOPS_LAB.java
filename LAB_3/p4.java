package LAB_3;

import java.util.Scanner;

class Account {
    int accNo;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accNo = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar;

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter Aadhar number: ");
        aadhar = sc.nextLong();
    }

    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar);
    }
}

public class p4 {
    public static void main(String[] args) {
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of person " + (i + 1));
            p[i] = new Person();
            p[i].input();
        }

        System.out.println("\n--- Details ---");
        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}