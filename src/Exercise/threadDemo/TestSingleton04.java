package Exercise.threadDemo;

import java.util.concurrent.*;

/**
 * Author: 徐明皓
 * Date: 2021-08-13 15:16
 * Description: <描述>
 */
public class TestSingleton04 {
    public static void main(String[] args) throws Exception {
        //带返回值的方式创建多线程
        Callable<Object> c = new Callable<>() {
            @Override
            public Object call() throws Exception {
                return Singleton04.getINSTANCE();
            }
        };

        //启动两个线程
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Object> f1 = es.submit(c);
        Future<Object> f2 = es.submit(c);
        Singleton04 instance1 = (Singleton04) f1.get();
        Singleton04 instance2 = (Singleton04) f2.get();
        System.out.println(instance1 == instance2);



    }
}
