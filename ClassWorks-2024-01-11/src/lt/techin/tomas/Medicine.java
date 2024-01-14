package lt.techin.tomas;

public class Medicine extends Product{
    public Medicine(String name, double price, int vat) {
        super(name, price, vat);
    }

    @Override
    public String getDescription() {
        return ".....";
    }
}
