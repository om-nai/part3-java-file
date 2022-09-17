class A {
    void display() {
        System.out.println("This is the display of class A.");
    }
}

class B extends A {
    void display() {
        super.display();
        System.out.println("This is the display of class B.");
    }
}

public class pra_3_4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        
    }
}
