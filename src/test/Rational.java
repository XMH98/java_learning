package test;

public class Rational {
    int numerator = 1;
    int denominator = 1;
    void setNumerator(int a){
        numerator = a;
    }

    void setDenominator(int b){                 //设置分母
        denominator = b;
    }

    int getNumerator(){
        return numerator;
    }

    int getDenominator(){
        return denominator;
    }

    Rational add(Rational r){                   //加法运算
        int a = r.getNumerator();               //返回有理数r的分子
        int b = r.getDenominator();             //返回有理数r的分母
        int newNumerator = numerator*b + denominator*a;     //计算出新分子
        int newDenominator = denominator*b;                 //计算出新分母
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    Rational sub(Rational r){                   //减法运算
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator*b - denominator*a;
        int newDenominator = denominator*b;
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    Rational muti(Rational r){                  //乘法运算
        int a = r.getNumerator();
        int b = r.getDenominator();
        int newNumerator = numerator*a;
        int newDenominator = denominator*b;
        Rational result = new Rational();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    Rational div(Rational r){                   //除法运算
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
