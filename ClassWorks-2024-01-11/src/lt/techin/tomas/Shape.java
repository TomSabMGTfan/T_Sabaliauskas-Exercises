package lt.techin.tomas;

public class Shape {
    private double a;
    private double b;

    public Shape(double a, double b) {
        if (a <= 0 || b <= 0){
            System.out.println("Parameter is not good ...");
        }else {

        this.a = a;
        this.b = b;
    }}

    public Shape(double lenght){
        this.a = lenght;
        this.b = lenght;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double countArea(){
        return a * b;
    }

    public void getInfo(){
        System.out.println("a = " + a + ", b = " + b);
    }
}
