package lt.techin.tomas.PD9_2;

import static lt.techin.tomas.PD9_2.Food_PD9_2.VAT;

public abstract class AbstractProduct_9_2 implements ProductItem_PD9_2, DiscountItem_PD9_2 {
    private final String name;

    public AbstractProduct_9_2(String name, double price) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



@Override
    public double getPrice() {
        return this.getPrice();
    }

    @Override
    public double getPriceWithVat() {
        return this.getPrice() * VAT;
    }

    @Override
    public double getPriceWithDiscount(double discount) {
        return this.getPrice() * discount;
    }





}
