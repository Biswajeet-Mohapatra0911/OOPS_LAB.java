package LAB_3;

import java.util.Scanner;

class Plastic2D {
    double l, w;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        System.out.print("Enter width: ");
        w = sc.nextDouble();
    }

    double cost() {
        return l * w * 40;
    }
}

class Plastic3D extends Plastic2D {
    double h;

    void input3D() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        h = sc.nextDouble();
    }

    double cost3D() {
        return l * w * h * 60;
    }
}

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            Plastic2D p = new Plastic2D();
            p.input();
            System.out.println("Cost = Rs " + p.cost());
        } else {
            Plastic3D p = new Plastic3D();
            p.input3D();
            System.out.println("Cost = Rs " + p.cost3D());
        }
    }
}