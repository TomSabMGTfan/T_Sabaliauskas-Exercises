package lt.techin.tomas;

import java.util.ArrayList;

public class Baket {
    private ArrayList<Product> products = new ArrayList<>();

    public void putProducts(Product product){
        products.add(product);
    }

    public ArrayList<Product> getBasket(){
        return products;
    }
}
