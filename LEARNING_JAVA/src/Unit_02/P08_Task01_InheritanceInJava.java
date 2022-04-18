package Unit_02;

public class P08_Task01_InheritanceInJava {

    public static void main(String[] args) {
        Three g = new Three();
        g.methodone();
        g.methodtwo();
        g.methodone();
        g.methodthree();
        Two two = new Two(1);
        D obj = new D(2);
        obj.methodfour();
    }
}

class One {
    int a;

    One(int x) {
        System.out.println("Inside Constructor One");
    }

    public void methodone() {
        System.out.println("First Method");
    }

}

class Two extends One {
    int b;

    Two(int x) {
        super(3);
        b = x;
        System.out.println("Two");
    }

    public void methodtwo() {
        System.out.println("Second Method");
    }
}

class Three extends Two {
    int c;

    Three() {
        super(1);
        System.out.println("Inside Constructor Three");
    }

    Three(int x) {
        super(1);
        c = x;
        System.out.println("Three");
    }

    public void methodthree() {
        System.out.println("Third Method");
    }
}

class A {
    int a;

    A(int a1) {
        a = a1;
    }

    public void methodone() {
        System.out.println(a);
    }
}

class B extends A {
    int b;

    B(int b1) {
        super(10);
        b = b1;

    }

    public void methodtwo() {
        System.out.println(b);
    }
}

class C extends A {
    int c;

    C() {
        super(10);
        c = 10;
    }

    public void methodthree() {
        System.out.println(c);
    }
}

class D extends A {
    int d;

    D(int d1) {
        super(d1);
        d = d1;
    }

    public void methodfour() {
        System.out.println(d);
    }
}