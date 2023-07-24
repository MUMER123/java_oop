package PersonCode;

public class Teacher extends Person{
    int salary;
    String qualification;
    public Teacher() {
        super();
    }

    public Teacher(String name,String gender, int age, int salary, String qualification) {
        super(name, gender, age);
        this.salary = salary;
        this.qualification = qualification;
    }

    @Override
    public void introduce() {
        System.out.println("Hello! "+name+" here, I am a Teacher with Qualification: "+qualification+". I am "+age+" years old and I am a "+gender+". My salary is : "+salary);

    }
}
