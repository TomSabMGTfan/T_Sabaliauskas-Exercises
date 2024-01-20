package lt.techin.tomas.PD9_2;

public class Alcohol_PD9_2 extends AbstractProduct_9_2 {

    private static final double VAT = 1.21;

    public Alcohol_PD9_2(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPriceWithVat() {
        return this.getPrice() * VAT;
    }

}
