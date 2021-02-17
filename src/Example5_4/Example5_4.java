package Example5_4;

public class Example5_4 {
    public static void main(String args[]){
        double math = 62,english = 76.5,chinese = 67;
        ImportantUniversity univer = new ImportantUniversity();
        univer.enterRule(math,english,chinese);     //调用重写方法
        math = 91;
        english = 82;
        univer.enterRule(math,english,chinese);     //调用重写方法
    }
}
