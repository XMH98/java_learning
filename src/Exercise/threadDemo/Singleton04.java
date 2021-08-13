package Exercise.threadDemo;

/**
 * Author: 徐明皓
 * Date: 2021-08-13 15:11
 * Description: <描述>
 */

/**
 * 懒汉式：
 * 线程不安全的方式创建单例
 */

public class Singleton04 {

    private static Singleton04 INSTANCE;

    private Singleton04(){

    }

    public static Singleton04 getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE  =new Singleton04();
        }
        return INSTANCE;
    }

}
