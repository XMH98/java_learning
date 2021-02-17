package Example4_17;

public class Triangle {
    double sideA,sideB,sideC;
    public double getArea(){
        double p = (sideA+sideB+sideC)/2.0;
        double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return area;
    }
    public void setsides(double a,double b,double c){
        sideA = a;
        sideB = b;
        sideC = c;
    }
}
