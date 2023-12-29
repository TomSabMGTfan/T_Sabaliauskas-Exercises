package lt.techin;

public class PD3_2 {
    public static void main(String[] args) {
//Parašykite programą, kuri deklaruoja byte ir short kintamuosius, priskiria jiems reikšmes, atlieka
//keletą matematinių operacijų ir atspausdina rezultatus.

        byte myByte1 = 127;
        byte myByte2 = -99;
        int myResult1 = myByte1 + myByte2;
        int myResult2 = myByte1 * myByte2;
        System.out.println(myResult1 + " |byte + byte");
        System.out.println(myResult2 + " |byte * byte");

        short myShort1 = 32767;
        short myShort2 = -10387;
        int myResult3 = myShort1 - myShort2;
        int myResult4 = myShort1 / myShort2;
        System.out.println(myResult3 + " |short - short");
        System.out.println(myResult4 + " |short / short");
    }
}
