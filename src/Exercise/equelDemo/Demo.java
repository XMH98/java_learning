package Exercise.equelDemo;

/**
 * Author: 徐明皓
 * Date: 2021-07-06 13:57
 * Description: <描述>
 */
public class Demo {
    public static void main(String[] args) {
        String arr1 = new String("abc");
        String arr2 = new String("abc");

        if(arr1 == arr2){
            System.out.println("arr1==arr2 is true");
        }else{
            System.out.println("arr1==arr2 is false");
        }

        if(arr1.equals(arr2)){
            System.out.println("arr1.equals(arr2) is true");
        }else{
            System.out.println("arr1.equals(arr2) is false");
        }
    }
}
