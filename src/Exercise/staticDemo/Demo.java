package Exercise.staticDemo;

/**
 * Author: 徐明皓
 * Date: 2021-07-06 13:44
 * Description: <描述>
 */
public class Demo {
    static int A = 0;

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(A++);
        }
    }

}
