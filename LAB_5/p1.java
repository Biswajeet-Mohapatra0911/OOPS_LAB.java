package LAB_5;

import java.util.Scanner;

abstract class Student {
    int rollno;
    long regno;

    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno - ");
        rollno = sc.nextInt();
        System.out.print("Enter Registration no - ");
        regno = sc.nextLong();
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class p1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getinput();

        System.out.println("Rollno - " + k.rollno);
        System.out.println("Registration no - " + k.regno);
        k.course();
    }
}
