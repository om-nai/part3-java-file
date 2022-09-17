//ID:- 21CE081
import java.util.*;

interface IPrinter {
    default void printer() {
        System.out.println("This is a interface");
    }
}

interface IScanner {
    void get();
}

class Hardware implements IScanner, IPrinter {
    Scanner sc = new Scanner(System.in);
    String input;

    public void get() {
        System.out.print("Enter your String : ");
        input = sc.next();
    }

    void show() {
        System.out.println("Enterd String is " + input);
    }
}

public class pra_3_2 {
    public static void main(String[] args) {
        Hardware h = new Hardware();
        h.printer();
        h.get();
        h.show();
        }
}
