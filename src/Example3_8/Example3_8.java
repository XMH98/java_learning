package Example3_8;

public class Example3_8 {

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        char b[] = {'a','b','c','d'};
        for(int n=0;n<a.length;n++){    //传统方式
            System.out.print((a[n]));
        }
        for(int n=0;n<b.length;n++){    //传统方式
            System.out.print(b[n]);
        }
        System.out.println("");
        for(int i:a){                   //循环变量i依次取数组a的每一个元素的值（改进方式）
            System.out.print(i);
        }
        for(char ch:b){                 //循环变量ch依次取数组b的每一个元素的值（改进方式）
            System.out.print(ch);
        }
    }
}
