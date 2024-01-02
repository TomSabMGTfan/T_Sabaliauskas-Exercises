package lt.techin;

public class PD4_1 {
    public static void main(String[] args) {
        // Parašykite programą, kuri naudoja visus Java aritmetinius operatorius (+, -, *, /, %) su dviem
        //įvesties kintamaisiais ir atspausdina rezultatus
        double a = 10.00d;
        double b = 5.75d;
        double c = 3.69d;
        double d = -2.24d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("*************");
        double result1 = a + b;
        double result2 = c - d;
        double result3 = a * c;
        double result4 = b / d;
        System.out.println("result1:a + b= " + result1);
        System.out.println("result2:c - d= " + result2);
        System.out.println("result3:a * c= " + result3);
        System.out.println("result4:b / d= " + result4);
        System.out.println("*************");
        double result5 = (result1 + result2 + result3 + result4) % (result1 / result2 / result3 / result4);
        System.out.println("Final result, all Sum % all Division = " + result5);


    }
}
