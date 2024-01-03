package lt.techin;

public class PD4_4 {
    public static void main(String[] args) {
        //Parašykite programą,
        // kuri naudoja && ir || loginius operatorius
        // su būlio kintamaisiais ir atspausdina rezultatus

        boolean a= true;
        boolean b= false;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        boolean c = a && b;
        boolean d = a||b;

        System.out.println("a&&b= " + c);
        System.out.println("a||b= " + d);
    }
}
