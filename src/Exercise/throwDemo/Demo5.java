package Exercise.throwDemo;

/**
 * Author: 徐明皓
 * Date: 2021-07-06 16:15
 * Description: <描述>
 */
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static int getNumber() {

        int a = 0;

        try {
            String s = "t";
            a = Integer.parseInt(s);
            return a;
        } catch (NumberFormatException e) {
            a = 1;
            return a;
        } finally {
            a = 2;
        }
    }
}
