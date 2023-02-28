package ExampleOfOopsConcepts.AllInheritanceImplementation;

class BaseClass
{
    int a=10;
    public void getCaller()
    {
        System.out.println("mene call kiya getCaller se");
    }
}
class DerivedClass extends BaseClass
{
    public void getNotification(int a )
    {
        System.out.println("Clevertap se notification bheja"+a);
    }

}


public class ExampleOfSingleLevelInheritance {
    public static void main(String args[])
    {
        DerivedClass d=new DerivedClass();
        d.getNotification(d.a);
        d.getCaller();
    }

}
