package lt.techin.tomas;

public class Box {
    static double lenght;
    static double wight;
    static double height;

    public Box(){
        lenght = 10;
        wight = 10;
        height = 10;
    }

    public Box(double lenght, double wight, double height){
    setLenght(lenght);
    setWight(wight);
    setHeight(height);
    }

    public Box(double borderSize){
        setLenght(borderSize);
        setWight(borderSize);
        setHeight(borderSize);
    }

    public static double showVolume(){
        return lenght * height * wight;
    }

    public void setLenght(double lenght) {
        if (lenght <= 0){
            System.out.println("Incorrect Box size!");
        } else{
        this.lenght = lenght;
    }}

    public void setWight(double wight) {
        if (wight <= 0){
            System.out.println("Incorrect Box size!");
        } else {
        this.wight = wight;
    }}

    public void setHeight(double height) {
        if (height <= 0){
            System.out.println("Incorrect Box size!");
        } else {
        this.height = height;
    }}

}
