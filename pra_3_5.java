import userdefined.onlyClass;

class ClassA extends onlyClass {
    void display() {
        System.out.println("This is class A");
    }
}

public class Part_3_5 {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.print();
        obj.display();
    }
}
