package PersonCode;

public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;
    public Person (){

    }
    public Person (String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public abstract void introduce();
}
