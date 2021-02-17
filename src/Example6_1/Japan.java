package Example6_1;

public class Japan implements Computable {      //Japan类实现Computable接口
    int number;
    public int f(int x){
        return MAX+x;       //直接使用接口中的常量
    }
}
