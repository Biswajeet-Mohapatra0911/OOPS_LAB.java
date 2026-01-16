package LAB_4;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many toy details you want to accept?");
        int n = sc.nextInt();

        int toyId[] = new int[n];
        String toyName[] = new String[n];
        int toyQty[] = new int[n];
        double toyPrice[] = new double[n];

        double totalAmount = 0;

        // Taking input from user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Toy " + (i + 1));

            System.out.print("Enter Toy ID: ");
            toyId[i] = sc.nextInt();

            sc.nextLine();   // consume newline

            System.out.print("Enter Toy Name: ");
            toyName[i] = sc.nextLine();

            System.out.print("Enter Toy Quantity: ");
            toyQty[i] = sc.nextInt();

            System.out.print("Enter Toy Price: ");
            toyPrice[i] = sc.nextDouble();
        }

        // Display details
        System.out.println("\n----- TOY DETAILS -----");

        for (int i = 0; i < n; i++) {
            double amount = toyQty[i] * toyPrice[i];
            totalAmount = totalAmount + amount;

            System.out.println("\nToy " + (i + 1) + " Details:");
            System.out.println("Toy ID: " + toyId[i]);
            System.out.println("Toy Name: " + toyName[i]);
            System.out.println("Toy Quantity: " + toyQty[i]);
            System.out.println("Toy Price: " + toyPrice[i]);
            System.out.println("Total Price: " + amount);
        }

        // Display grand total
        System.out.println("\nGrand Total Billing Amount: " + totalAmount);

        sc.close();
    }
}


