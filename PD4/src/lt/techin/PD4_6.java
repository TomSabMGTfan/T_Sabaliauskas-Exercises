package lt.techin;

public class PD4_6 {
    public static void main(String[] args) {
        //Parašykite programą, kuri naudoja ternary operatorių ir atspausdina rezultatą
        int time = 10;
        String result = (time > 12) ? "Good day." : "Good morning, coffee time.";
        System.out.println(result);

        System.out.println("**********");

        int num1 = 10;
        int num2 = 20;
        int res = (num1 > num2) ? (num1+num2) : (num1-num2);
        System.out.println(res);

        //Since num1<num2,
        //the second operation is performed
       // res = num1 - num2 = -10


    }
}
