package LAB_3;

class Apple {
    void show() {
        System.out.println("Apple show()");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana show()");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry show()");
    }
}

public class p3 {
    public static void main(String[] args) {
        Apple a;

        a = new Apple();
        a.show();

        a = new Banana();
        a.show();

        a = new Cherry();
        a.show();
    }
}