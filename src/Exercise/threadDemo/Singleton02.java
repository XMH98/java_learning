package Exercise.threadDemo;

/**
 * Author: 徐明皓
 * Date: 2021-08-13 14:50
 * Description: <描述>
 */

/**
 * 枚举方式创建单例
 * 特点：
 *  代码简单，实现容易
 */

public enum Singleton02 {
    INSTANCE;
}

class singleton02Test{
    public static void main(String[] args) {
        Singleton02 instance = Singleton02.INSTANCE;
    }
}
