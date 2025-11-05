public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction (int n,int d){
        numerator = n;
        denominator = d;
    }

    public int getNum (){
        return numerator;
    }

    public int getDen(){
        return denominator;
    }

    public Fraction addFraction (Fraction a){
        int den = denominator*a.getDen();
        int num = numerator*a.getDen()+a.getNum()*denominator;
        Fraction fraction = new Fraction (num,den);
        return fraction;
    }

    public Fraction multiplyFraction (Fraction a){
        int den = denominator*a.getDen();
        int num = numerator*a.getNum();
        Fraction fraction = new Fraction (num,den);
        return fraction;
    }

    public Fraction reciprocalFraction (){
        int den = numerator;
        int num = denominator;
        Fraction fraction = new Fraction (num,den);
        return fraction;
    }


}
