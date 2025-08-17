package rationalnumbers;

public class RationalNumbers {
    private int denominator;
    private int numerator;

    public RationalNumbers(int numerator, int denominator) {
        //avoid denominator = 0
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator can not be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    //simplify fraction using gcd
    public void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        //handle negative denominator
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
            return gcd(b, a % b);
        }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {

        if(denominator == 0){
            throw new  IllegalArgumentException("denominator cannot be zero");
        }
        this.denominator = denominator;
        simplify();
    }
    public String toString(){
        return numerator  +  " / " + denominator;
    }
}


