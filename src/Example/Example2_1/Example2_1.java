package Example.Example2_1;

public class Example2_1 {

    public static void main(String[] args) {
        char chinaWord = '好',japWord = '帅';
        char you = '\u4F60';
        int position = 20320;
        System.out.println("汉字："+chinaWord+"的位置："+(int)chinaWord);
        System.out.println("日文："+japWord+"的位置："+(int)japWord);
        System.out.println(position+"位置上的字符是："+(char)position);
        position = 21319;
        System.out.println(position+"位置上的字符是："+(char)position);
        System.out.println("you:"+you);
    }
}
