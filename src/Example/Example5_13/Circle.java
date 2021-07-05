package Example.Example5_13;

public class Circle extends Geometry {
    double r;
    Circle(double r){
        this.r = r;
    }
    public double getArea(){
        return (3.14*r*r);
    }
}
