package Shu4_6;

class AAA{
    static{
        System.out.println("我是AAA中的静态块！");
    }
}
public class E {
    static{
        System.out.println("我是最先被执行的静态块！");
    }
    public static void main(String args[]){
        AAA a=new AAA();
        System.out.println("我在了解静态（static）块");
    }
}
