package rationalnumbers;

public class MultiplyRational {
    public RationalNumbers operation(RationalNumbers r1, RationalNumbers r2){
        int newNumerator = r1.getNumerator() * r2.getNumerator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumbers(newNumerator,newDenominator);
    }
}
