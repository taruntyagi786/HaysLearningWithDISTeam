package ExampleOfJDBC;

import java.sql.*;

class ApiPojo
{
    private String name;
    private String email;
    private String password;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "ExampleOfDataBaseConnectivity.Demo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
public class PojoInJsonFormats {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcexample";
        String username="root";
        String password="";
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection connection= DriverManager.getConnection(url,username,password);
              Statement statement=connection.createStatement();
              ResultSet resultSet=statement.executeQuery("select * from student");
                while(resultSet.next()){
                    ApiPojo p=new ApiPojo();
                    p.setName(resultSet.getString(1));
                    p.setEmail(resultSet.getString(2));
                    p.setPassword(resultSet.getString(3));
                    //System.out.println("Name:"+p.getName()+"Email"+p.getEmail()+" Password"+p.getPassword);
                    System.out.println(p.toString());

        }
                connection.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

//        ApiPojo d=new ApiPojo();
//        d.setEmail("taruntyagi07860@gmail.com");
//        d.setName("Tarun");
//        d.setPassword("8456834247r");
//        System.out.println(d.toString());
    }


}