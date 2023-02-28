package ExampleOfOopsConcepts.AllInheritanceImplementation;

import javax.swing.tree.DefaultMutableTreeNode;

class Demo{
    public void m1()
    {
        System.out.println("m1 is running");
    }

}
class Demo2 extends Demo{
    public void m2()
    {
        System.out.println("m2 is running");
    }
}
class Demo3 extends Demo{
    public void m3()
    {
        System.out.println("m3 is runnning");
    }
}

public class ExampleOfHeirarchicalInheritance {
    public static void main(String args[])
    {
        Demo3 d=new Demo3();
        Demo2 t=new Demo2();
        d.m3();
        d.m1();
        t.m2();
        t.m1();

    }

}
