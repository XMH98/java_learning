package Practice.Day4;
//实现两个线程，一个打印*，一个打印#
public class Day4_2 {
    public static void main(String[] args) {
        Content con1 = new Content("#########");
        new Thread(con1).start();
        Content con2 = new Content("*********");
        new Thread(con2).start();
    }
}
