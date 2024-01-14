package lt.techin.tomass;

public class Car {
    String color;
    String modelis;
    int productionYear;
    double price;
    boolean canDrive;

    // Default constructor
    public  Car(){

    }

    //Constructor
    public Car(String modelis, int productionYear, double price){
        this.modelis = modelis;
        this.productionYear = productionYear;
        this.price = price;
    }
    public Car(String modelis, double price) {
        this.modelis = modelis;

        this.price = price;
    }

    //Behavior
    boolean buyCar(){
        if (canDrive){
            return true;
        }
    return false;

}}
