package LAB_7;

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String msg) { super(msg); }
}
class MinException extends Exception {
    public MinException(String msg) { super(msg); }
}
class SecException extends Exception {
    public SecException(String msg) { super(msg); }
}

class Time {
    int h, m, s;

    void takeTime() throws HrsException, MinException, SecException {
        if (h < 0 || h > 24) throw new HrsException("hour is not greater than 24");
        if (m < 0 || m > 60) throw new MinException("minute is not greater than 60");
        if (s < 0 || s > 60) throw new SecException("second is not greater than 60");
    }
}

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t = new Time();

        System.out.print("Enter hours: ");
        t.h = sc.nextInt();
        System.out.print("Enter minutes: ");
        t.m = sc.nextInt();
        System.out.print("Enter seconds: ");
        t.s = sc.nextInt();

        try {
            t.takeTime();
            System.out.println("Correct Time-> " + t.h + ":" + t.m + ":" + t.s);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getClass().getSimpleName() + ":" + e.getMessage());
        }

        sc.close();
    }
}
