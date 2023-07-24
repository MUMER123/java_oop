public class Circle extends Shape {
    int radius;
    public Circle(){

    }
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    void CalculateArea() {
        System.out.println("Area of Circle : " + (3.14*this.radius*this.radius));
    }
}
