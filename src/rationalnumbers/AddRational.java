package rationalnumbers;

public class AddRational {
    public RationalNumbers operation(RationalNumbers r1, RationalNumbers r2){
        int newNumerator = r1.getNumerator() * r2.getDenominator() +
                           r2.getNumerator() * r1.getDenominator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new RationalNumbers(newNumerator,newDenominator);
    }
}
