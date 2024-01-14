package lt.techin.tomas;

public abstract class Product {
    private String name;
    private double price;
    private int vat; //%

    public Product(String name, double price, int vat) {
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    public  double getPrice(){
        return price;
    }

    public double getPriceWithVat(){
        return price + (price * vat / 100);
    }
    public abstract String getDescription();

}
