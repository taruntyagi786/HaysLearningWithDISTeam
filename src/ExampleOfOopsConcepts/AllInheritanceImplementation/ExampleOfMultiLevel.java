package ExampleOfOopsConcepts.AllInheritanceImplementation;

class First
{
    public void m1()
    {
        System.out.println("tarun tyagi ");
    }
}
class Second extends First{
    public void m2()
    {
        System.out.println("Nikhil Gupta");
    }

}
class Third extends Second{
    public void m3()
    {
        System.out.println("prashant chaudhary");
    }

}
public class ExampleOfMultiLevel {
    public static void main(String args[])
    {
        Third t=new Third();
        t.m2();
        t.m3();
        t.m1();
    }
}
