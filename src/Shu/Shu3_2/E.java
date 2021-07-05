package Shu.Shu3_2;

public class E {
    public static void main(String args[]){
        char c='\0';
        for(int i=1;i<=4;i++){
            switch(i){
                case 1: c='J';
                    System.out.print(c);
                case 2: c='E';
                    System.out.print(c);
                    break;
                case 3: c='P';
                    System.out.print(c);
                default:System.out.print("好");
            }
        }
    }
}
