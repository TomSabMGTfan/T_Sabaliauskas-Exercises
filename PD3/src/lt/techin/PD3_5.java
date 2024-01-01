package lt.techin;

public class PD3_5 {
    public static void main(String[] args) {
        //Parašykite programą, kuri demonstruoja skirtingų primitivių duomenų tipų konvertavimą (casting),
        // pvz., int į double, long į int, ir pan.
        int intNumber1 = 127;
        double doubleNumber = intNumber1;
        System.out.println("127 --> " + doubleNumber);

        long longNumber1 = 15000000000L;
        int intNumber2 = (int) longNumber1;
        System.out.println(longNumber1);

        byte byteNumber = 127;
        short shortNumber = byteNumber;
        System.out.println(shortNumber);



    }
}
