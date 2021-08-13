package Exercise.threadDemo;

/**
 * Author: 徐明皓
 * Date: 2021-08-13 14:41
 * Description: <描述>
 */

/**
 * 饿汉式单例：直接实例化
 * 1、只有一个实例对象
 * 2、对实例对象保存
 * 3、主动对外暴露
 */
public class Singleton01 {

    //2
    private static Singleton01 INSTANCE = new Singleton01();

    //1
    private Singleton01(){

    }

    //3、对外暴露
    public Singleton01 getInstance(){
        return INSTANCE;
    }
}
