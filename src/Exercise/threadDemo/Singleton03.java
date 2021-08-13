package Exercise.threadDemo;

/**
 * Author: 徐明皓
 * Date: 2021-08-13 14:56
 * Description: <描述>
 */

/**
 * 静态代码块方式创建单例
 */

public class Singleton03 {

    private static Singleton03 INSTANCE;

    static{
        INSTANCE = new Singleton03();
        //顺便可以加载配置文件
    }


    private Singleton03(){

    }

    public static Singleton03 getINSTANCE() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton03 singleton = Singleton03.getINSTANCE();
        Singleton03 singleton2 = Singleton03.getINSTANCE();

        System.out.println(singleton == singleton2);

    }
}
