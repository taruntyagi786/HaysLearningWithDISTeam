package ExampleOfOopsConcepts;
class Student
{
    private String name;
    private int age;
    private String email;
    private int password;


    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password=" + password +
                ", email='" + email + '\'' +
                '}';
    }



}

public class ExampleOfEncapsulation {
    public static void main(String args[])
    {
        Student s=new Student();
        s.setAge(20);
        s.setEmail("taruntyagi07860@gmail.com");
        s.setName("tarun");
        s.setPassword(1243757);
        System.out.println(s.toString());
    }
}
