package Example.Example4_22;

public class Rational {
    int numerator = 1;      //分子
    int denominator = 1;    //分母

    public void setNumerator(int a){                   //设置分子
        int c=f(Math.abs(a),denominator);       //计算最大公约数
        numerator = a/c;
        denominator = denominator/c;
        if(numerator<0 && denominator<0){
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public void setDenominator(int b){                 //设置分母
        int c=f(numerator,Math.abs(b));         //计算最大公约数
        numerator = numerator/c;
        denominator = b/c;
        if(numerator<0 && denominator<0){
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    int f(int a,int b){                         //求a和b的最大公约数
        if(a==0)
            return 1;
        if(a<b){
            int c = a;
            a = b;
            b = c;
        }
        int r=a%b;
        while(r!=0){
            a = b;
            b = r;
            r = a%b;
        }
        return b;
    }

    public Rational add(Rational r){                   //加法运算
        int a = r.getNumerator();               //返回有理数r的分子
        int b = r.getDenominator();             //返回有理数r的分母
        int newNumerator = numerator*b + denominator*a;     //计算出新分子
        int newDenominator = denominator*b;                 //计算出新分母
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    public Rational sub(Rational r){                   //减法运算
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator*b - denominator*a;
        int newDenominator = denominator*b;
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    public Rational muti(Rational r){                  //乘法运算
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator*a;
        int newDenominator = denominator*b;
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    public Rational div(Rational r){                   //除法运算
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator*b;
        int newDenominator = denominator*a;
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }
}
