package lt.techin.tomas;

public class Newspaper extends Product{
    public Newspaper(String name, double price, int vat) {
        super(name, price, vat);
    }

    @Override
    public String getDescription() {
        return "....";
    }
}
