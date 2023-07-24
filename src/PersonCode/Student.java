package PersonCode;

public class Student extends Person{
    int roll_no;
    String course;
    int semester;

    public Student(){
        super();
    }
    public Student(String name, String gender, int age,int roll_no,String course,int semester){
        super(name, gender, age);
        this.roll_no = roll_no;
        this.course = course;
        this.semester = semester;
    }

    @Override
    public void introduce() {
        System.out.println("Hello! "+name+" here, I am a Student of "+course+" in "+semester+"th Semester. My Roll No is "+roll_no+". I am "+age+" years old.");
    }
}
