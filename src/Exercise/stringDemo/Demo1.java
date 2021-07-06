package Exercise.stringDemo;

/**
 * Author: 徐明皓
 * Date: 2021-07-06 17:39
 * Description: <描述>
 */
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = "abc";


        System.out.println(s1==s5);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4);
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s4));
    }
}
