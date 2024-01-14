package lt.techin.tomas;

public class Circle extends Shape{
    public Circle(double lenght) {
        super(lenght);
    }

    public double countArea(){
        return 2 * Math.PI * getA();
    }

    public void getInfo(){
        System.out.println("Radius: " + getA());
    }
}
