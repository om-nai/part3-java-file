interface Squre
{
    public void squre(int a);
   
    default void show()
    {
      System.out.println("This is Default Method");
    }
}
  
class Part_3_7 implements Squre
{
    public void squre(int a)
    {
        System.out.println(a*a);
    }
    public static void main(String args[])
    {
        Part_3_7 d = new Part_3_7();
        d.squre(4);
        d.show();
    }
}
