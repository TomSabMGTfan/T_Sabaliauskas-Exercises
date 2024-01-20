package lt.techin.tomas.PD9_2;

import java.util.ArrayList;

public class ShopingCart_PD9_2 {
    private final ArrayList<AbstractProduct_9_2> items = new ArrayList<>();

    public void addItem(AbstractProduct_9_2 item){
       items.add(item);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (AbstractProduct_9_2 element : items){
            totalPrice += element.getPrice();
        }
        return totalPrice;
        }
        public double getTotalPriceWithVat(){
        double totalPriceWithVat = 0;
        for (AbstractProduct_9_2 element : items){
            totalPriceWithVat += element.getPriceWithVat();
        }
            return totalPriceWithVat;
        }}


