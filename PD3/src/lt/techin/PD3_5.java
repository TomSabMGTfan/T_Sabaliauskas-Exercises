package lt.techin;

public class PD3_5 {
    public static void main(String[] args) {
        //Parašykite programą, kuri demonstruoja skirtingų primitivių duomenų tipų konvertavimą (casting),
        // pvz., int į double, long į int, ir pan.
        int intNum1 = 127;
        double doubleNum = intNum1;
        System.out.println("127 --> " + doubleNum);

        long longNum1 = 15000000000L;
        int intNum2 = (int) longNum1;
        System.out.println(longNum1);

        byte byteNum = 127;
        short shortNum = byteNum;
        System.out.println(shortNum);



    }
}
