package ExampleOfFinalKeyword;

final class First
{

} class Second extends First{//final class  cannot be inherits
    public void display()
    {
        System.out.println("final class cannot extends by another class");
    }
}
public class ExampleOfFinalClass {
    public static void main(String args[])
    {
        Second s=new Second();
        s.display();
    }
}
