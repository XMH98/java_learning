package Exercise.hashMapDemo;

import java.util.HashMap;

/**
 * Author: 徐明皓
 * Date: 2021-07-17 12:02
 * Description: <描述>
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> site = new HashMap<>();
        site.put(1,"hello");
        site.put(2,"world");
        System.out.println(site);

        HashMap<String,String> site2 = new HashMap<>();
        site2.put("one","hhhhhh");
        site2.put("two","wwwwww");
        site2.put("three","aaaaaa");
        site2.put("four","eeeeee");
        System.out.println(site2);

        System.out.println(site.get(1));

        site2.remove("three");
        System.out.println(site2);

        site2.clear();
        System.out.println(site2);

        System.out.println(site.size());

    }
}
