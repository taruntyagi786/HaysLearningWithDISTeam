package ExampleOfThis;

class Baccho {
    int age;
    String name;
    String email;
    public String hello = "Hello baccho!";
    Baccho()
    {

    };
    Baccho(String name,int age,String email)
    {
       this.name=name;
       this.age=age;
       this.email=email;
    }


    public void printHello() {
        System.out.println(this.hello);//this.hello refers to current datasets(curret object)
        System.out.println(name+" "+age+" "+email);
    }
}

public class Student {
        public static void main(String args[])
        {
            Baccho b=new Baccho();
            Baccho t=new Baccho("tarun",20,"tarun@bikry.com");
            b.printHello();
            t.printHello();
        }
}


