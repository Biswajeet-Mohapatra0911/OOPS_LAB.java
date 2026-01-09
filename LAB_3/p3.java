package LAB_3;

class Apples {
    void show() {
        System.out.println("Apple show()");
    }
}

class Banana extends Apples {
    void show() {
        System.out.println("Banana show()");
    }
}

class Cherry extends Apples {
    void show() {
        System.out.println("Cherry show()");
    }
}

public class p3 {
    public static void main(String[] args) {
        Apples a;

        a = new Apples();
        a.show();

        a = new Banana();
        a.show();

        a = new Cherry();
        a.show();
    }
}