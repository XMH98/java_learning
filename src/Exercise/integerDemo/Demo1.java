package Exercise.integerDemo;

/**
 * Author: 徐明皓
 * Date: 2021-07-06 14:12
 * Description: <描述>
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=10;
        Integer c=new Integer(10);
        Integer d=new Integer(10);


        System.out.println(a==b);
        System.out.println(c==d);


        System.out.println(a.equals(b));
        System.out.println(c.equals(d));


        System.out.println(a.equals(c));
    }
}
