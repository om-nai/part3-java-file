interface P {
    int a = 1;
    void display();
}

interface P1 extends P {
    int b = 2;
    void display1();
}

interface P2 extends P {
    int c = 3;
    void display2();
}

interface P12 extends P1, P2 {
    int d = 4;
    void display3();
}

class interfaceInheritance implements P12 {
    public void display() {
        System.out.println("The value of a is " + a);
    }

    public void display1() {
        System.out.println("The value of b is " + b);
    }

    public void display2() {
        System.out.println("The value of c is " + c);
    }

    public void display3() {
        System.out.println("The value of d is " + d);
    }
}

public class pra_3_3 {
    public static void main(String[] args) {
        interfaceInheritance obj = new interfaceInheritance();
        obj.display();
        obj.display1();
        obj.display2();
        obj.display3();
        
    }
}
