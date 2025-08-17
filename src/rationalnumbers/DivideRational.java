package rationalnumbers;

public class DivideRational {
    public RationalNumbers operation(RationalNumbers r1, RationalNumbers r2) {

        if (r2.getNumerator() == 0){
            throw new ArithmeticException(" cannot divide by zero");
        }
        int newNumerator = r1.getNumerator() * r2.getDenominator();
        int newDenominator = r2.getNumerator() * r1.getDenominator();
        return new RationalNumbers(newNumerator,newDenominator);
    }
}
