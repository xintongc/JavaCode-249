package assignments.q01_fraction;

/**
 * Created by zncu on 2017-02-19.
 */
public class Fraction {

    public int numerator;
    public int denominator;

    public String description() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0){
            this.denominator = 1;
        }
        else {
            this.denominator = denominator;
        }
    }

    public Fraction() {
//        numerator = 1;
//        denominator = 1;
        this(1,1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    public Fraction(String string) {
        int index = string.indexOf("/");
        numerator = Integer.valueOf(string.substring(0, index));
        denominator = Integer.valueOf(string.substring(index + 1));
    }

    public double value(){
        return (double) numerator / denominator;
    }




    public Fraction add(Fraction fraction) {
        int numerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        int denominator = this.denominator * fraction.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction f){
        Fraction fra = new Fraction();
        fra.numerator = numerator * f.denominator - denominator * f.numerator;
        fra.denominator = denominator + f.denominator;
        return fra;
    }

    public Fraction multiply (Fraction f){
        Fraction fra = new Fraction();
        fra.numerator = numerator *  f.numerator;
        fra.denominator = denominator + f.denominator;
        return fra;
    }

    public Fraction divide (Fraction f){
        Fraction fra = new Fraction();
        fra.numerator = numerator *  f.denominator;
        fra.denominator = denominator + f.numerator;
        return fra;
    }

    public Fraction simplify(){
        Fraction fra = new Fraction();
        if((denominator > 0 && numerator > 0)||(denominator > 0 && numerator < 0)) {
            fra.denominator = denominator;
            fra.numerator = numerator;

        } else {
            fra.denominator = -denominator;
            fra.numerator = -numerator;
        }

        int min = ((Math.abs(numerator) < Math.abs(denominator)) ? numerator : denominator );
        for(int i = min; i>= 2; i--){
            if(fra.numerator % i == 0 && fra.denominator % i == 0)
            {
                fra.denominator /=  i;
                fra.numerator /= i;
            }
        }
        return fra;
    }

    public Fraction simplify2() {
        int large = Math.max(numerator, denominator);
        int small = Math.min(numerator, denominator);

        int remain = large % small;
        while(remain != 0) {
            large = small;
            small = remain;
            remain = large % small;
        }

        int greatestCommonDivisor = small;

        int numerator = this.numerator / greatestCommonDivisor;
        int denominator = this.denominator / greatestCommonDivisor;

        return new Fraction(numerator, denominator);
    }

}