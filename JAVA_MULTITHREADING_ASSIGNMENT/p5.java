package JAVA_MULTITHREADING_ASSIGNMENT;

class ArrivalTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Arrival message " + i);
        }
    }
}

class DepartureTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Departure message " + i);
        }
    }
}

class BoardingTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boarding gate announcement " + i);
        }
    }
}

public class p5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ArrivalTask());
        Thread t2 = new Thread(new DepartureTask());
        Thread t3 = new Thread(new BoardingTask());

        t1.start();
        t2.start();
        t3.start();
    }
}