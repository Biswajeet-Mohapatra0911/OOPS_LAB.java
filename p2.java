package LAB_7;

public class p2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0; // division by zero

        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
