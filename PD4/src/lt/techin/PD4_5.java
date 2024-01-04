package lt.techin;

public class PD4_5 {
    public static void main(String[] args) {
        //Parašykite Java programą, kuri naudoja visus priskyrimo operatorius (=, +=, -=, *=, /=, %=) su
        //kintamaisiais ir atspausdina rezultatus.

        int x1 = 3;
        System.out.println(" = " + x1);

        int x2 = 5;
        x2 += 3;
        System.out.println(" += " + x2);

        int x3 = 5;
        x3 -= 3;
        System.out.println(" -= " + x3);

        int x4 = 5;
        x4 *= 3;
        System.out.println(" *= " + x4);

        double x5 = 5;
        x5 /= 3;
        System.out.println(" /= " + x5);

        int x6 = 5;
        x6 %= 3;
        System.out.println(" %= " + x6);

    }
}
