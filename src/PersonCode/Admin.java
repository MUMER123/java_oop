package PersonCode;

public class Admin extends Person {
    String username;
    String password;

    public Admin(){
        super();
    }
    public Admin(String name,String gender,int age,String username,String password){
        super(name, gender, age);
        this.username = username;
        this.password = password;
    }

    @Override
    public void introduce() {
        System.out.println("Hello! "+name+" here, I am "+age+" years old. I am the Admin with username: "+username+" and password: ********");

    }
}
