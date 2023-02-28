package ExampleOfSuper;

 class DemoOfSuperCLass {
    public void runner()
    {
        System.out.println("tarun is running ");
    }
}
class Demo2 extends DemoOfSuperCLass
{

    public void runner()//method name same in child and parent class so we called parent class method in the child class method woth the help of super.
    {
       System.out.println("nikhil is running");
       super.runner();
    }
}
public class Main
{
    public static void main(String args[])
    {
     Demo2 d=new Demo2();//taking child reference //output--->nikhil is running
                                                              //tarun is running

        // DemoOfSuperCLass d=  new DemoOfSuperCLass();//output-->tarun is running

      d.runner();
    }
}