package Unit_02;

/*
An interface is a completely (100%) abstract class.
that is used to group related methods with empty bodies.
Multiple interface can be implemented at the same time in one class
No defination in an abstract class ... 
*/
interface Animal {
    public void AnimalSound();

    public void run();
}

interface Human {
    public void HumanSound();

    public void run1();
}

public class P12_Task01_InterfaceInJava {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.funcA();
        obj.funcB();
    }

    public void AnimalSound() {

    }

    public void run() {

    }
}

class Species implements Animal, Human {
    public void AnimalSound() {
        System.out.println("we are inside Animal ");
    }

    public void run() {
        System.out.println("We are inside animal run method");
    }

    public void HumanSound() {
        System.out.println("We are inside Human");
    }

    public void run1() {
        System.out.println("we are inside human run method");
    }
}

interface A1 {
    void funcA();
}

interface B1 extends A1 {
    void funcB();
}

class C1 implements B1 {
    public void funcA() {
        System.out.println("This is funcA from A1");
    }

    public void funcB() {
        System.out.println("This is funcB from A2");
    }
}