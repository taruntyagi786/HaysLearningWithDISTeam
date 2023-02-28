package ExampleOfFinalKeyword;

public class ExampleToMakeVariableFinal {
    public final int age=20;//first come access specifier then final keyword then datatype then variable name
    public void display()
    {
        age=30;//compile error final varible cannot change
    }
    public static void main(String args[])
    {
        ExampleToMakeVariableFinal t=new ExampleToMakeVariableFinal();
        t.display();

    }
}
