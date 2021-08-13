package Exercise.threadDemo;

/**
 * Author: 徐明皓
 * Date: 2021-08-13 15:11
 * Description: <描述>
 */

/**
 * 懒汉式：
 * 线程安全的方式创建单例
 * 就是多加了一个 synchronized
 */

public class Singleton05 {

    private static Singleton05 INSTANCE;

    private Singleton05(){

    }

    public static synchronized Singleton05 getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE  =new Singleton05();
        }
        return INSTANCE;
    }

}
