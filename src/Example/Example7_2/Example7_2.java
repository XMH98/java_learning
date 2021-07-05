package Example.Example7_2;

public class Example7_2 {
    public static void main(String args[]){
        ShowBoard board = new ShowBoard();
        board.showMess(new OutputEnglish());        //向参数传递OutputAlphabet的子类OutputEnglish的对象
        board.showMess(new OutputAlphabet() {       //向参数传递OutputAlphabet的匿名子类的对象
            public void output() {
                for(char c='α';c<='ω';c++){         //输出希腊字母
                    System.out.printf("%3c",c);
                }
            }
        });                 //注意分号在这里
    }
}
