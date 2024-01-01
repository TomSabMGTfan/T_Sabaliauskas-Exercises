package lt.techin;

public class PD3_4 {
    public static void main(String[] args) {
        //Sukurkite programą, kuri atlieka keletą loginių operacijų su boolean kintamaisiais ir atspausdina
        //rezultatus.
        boolean b1 = true;
        boolean b2 = false;

        //0 AND 0 = 0
        //1 AND 0 = 0
        //0 AND 1 = 0
        //1 AND 1 = 1
        //AND is represented by the ampersand - 1 & 1 = 1

        System.out.println("and: " + (b1 && b2));
        System.out.println("and: " + (b2 && b1));
        System.out.println("and: " + (b2 && b2));
        System.out.println("and: " + (b1 && b1));

        //0 OR 0 = 0
        //1 OR 0 = 1
        //0 OR 1 = 1
        //1 OR 1 = 1
        //OR is represented by the vertical bar (pipe) - 1 | 1 = 1

        System.out.println("or: " + (b1 || b2));
        System.out.println("or: " + (b2 || b1));
        System.out.println("or: " + (b2 || b2));
        System.out.println("or: " + (b1 || b1));


    }
}
