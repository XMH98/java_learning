package Practice.Day2;

//  统计字符串"2130155974304532604948767654109410457806239"每个元素出现的次数，
//	并打印输出，格式：比如0出现10次， 0-----10

public class Day2_1 {
    public static void main(String[] args) {
        String s = "2130155974304532604948767654109410457806239";
        int[] arrs = new int[10];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index = c - '0';
            arrs[index]++;
        }
        for(int i = 0;i<arrs.length;i++){
            System.out.println(i+"------->"+arrs[i]);
        }
    }
}
