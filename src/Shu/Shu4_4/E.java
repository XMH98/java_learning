package Shu.Shu4_4;

class A{
    double f(int x,double y){
        return x+y;
    }
    int f(int x,int y){
        return x*y;
    }
}
public class E {
    public static void main(String args[]){
        A a=new A();
        System.out.println(a.f(10,10));
        System.out.println(a.f(10,10.0));
    }
}
