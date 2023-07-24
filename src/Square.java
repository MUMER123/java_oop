public class Square extends Shape {
    float length;
    float width;

    public Square(){

    }
    public Square(float length , float width){
        this.length = length;
        this.width = width;
    }

    @Override
    void CalculateArea() {
        System.out.println("Area of Square : " + (this.length*this.width));
    }
}
