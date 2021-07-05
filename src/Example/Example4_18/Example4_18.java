package Example.Example4_18;

import Example.Example4_17.Triangle;
public class Example4_18 {
    public static void main(String args[]){
        Triangle tri = new Triangle();
        tri.setsides(30,40,50);
        System.out.println(tri.getArea());
    }
}
