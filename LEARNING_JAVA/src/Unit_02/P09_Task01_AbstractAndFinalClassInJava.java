package Unit_02;

abstract class Bike {
    int a;

    Bike() {
        System.out.println("Inside Bike Constructor: " + a);
    }

    void display() {
        System.out.println("This is a Display Method");
    }
}

class Honda4 extends Bike {
    void run() {
    }
}

public class P09_Task01_AbstractAndFinalClassInJava {
    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.display();
    }
}

final class Super {
    public int data = 30;

    void display() {
        System.out.println(data);
    }
}
/*
 * public class Sub extends Super {
 * void display2() {
 * display();
 * }
 * }
 */