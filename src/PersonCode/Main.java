package PersonCode;

public class Main {
    public static void main(String args[]){
        Person p1 = new Student("M.Umer","Male",19,539,"BSIT",6);
        p1.introduce();
        Person p2 = new Teacher("Ali","Male",30,80000,"BS_Psychology");
        p2.introduce();
        Person p3 = new Admin("Uzair","Male",22,"uzairdev","uzair123");
        p3.introduce();
    }
}
