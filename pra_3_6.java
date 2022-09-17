//Packge class

package pack;

public class hello {
    public void print()
    {
        System.out.println("This is packge method");
    }
}
//Importing class
import pack.hello;
public class pr3_6 {
    public static void main(String[] args) {
        hello ob=new hello();
        System.out.println("This is importing class");
        ob.print();
         }
}
