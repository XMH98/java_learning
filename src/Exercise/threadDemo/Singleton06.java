package Exercise.threadDemo;

/**
 * Author: 徐明皓
 * Date: 2021-08-13 15:33
 * Description: <描述>
 */

/**
 * 懒汉式：静态的内部类的方式
 * 线程安全的
 * 在内部类被加载和初始化时，才创建实例
 * 静态内部类不会随着外部类的加载和初始化而创建
 */

public class Singleton06 {

    private Singleton06(){}

    private static class Inner {
        private static Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance(){
        return Inner.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();

        System.out.println(instance == instance2);
    }

}
