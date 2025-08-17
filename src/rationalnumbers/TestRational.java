package rationalnumbers;

public class TestRational {
    public static void main(String[]args){
        RationalNumbers r1 = new RationalNumbers(10,50);
        RationalNumbers r2 = new RationalNumbers(40,80);

        AddRational add = new AddRational();
        SubtractRational sub = new SubtractRational();
        DivideRational div = new DivideRational();
        MultiplyRational mul = new MultiplyRational();

        System.out.println("r1+r2 = "  +  add.operation(r1,r2));
        System.out.println("r1-r2 = "  + sub.operation(r1,r2));
        System.out.println("r1/r2 = "  + div.operation(r1,r2));
        System.out.println("r1*r2 = "  + mul.operation(r1,r2));

    }
}
