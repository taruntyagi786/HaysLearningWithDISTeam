package ExampleOfFinalKeyword;
class Demo
{
    public  void display()
    {
        System.out.println("tarun activity");
    }
}
class Demo2 extends Demo{
    public final void display()
    {
        System.out.println("final method cannot override");
    }
}
public class ExampleOfFinalMethod {
    public static void main(String args[])
    {
        Demo2 d=new Demo2();
        d.display();
    }
}
