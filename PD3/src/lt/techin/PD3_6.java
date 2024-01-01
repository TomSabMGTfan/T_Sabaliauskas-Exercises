package lt.techin;

public class PD3_6 {
    public static void main(String[] args) {
        //Parašykite programą, kuri demonstruoja klasių kėvalų (angl. wrapper classes) naudojimą.

        Integer myInt = 5;
        Double myDouble = 5.99d;
        Character myChar = 'A';
        Boolean myBool = true;
        Float myFloat = 1.27f;
        Long myLong = 999999L;

        System.out.println("********");

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBool);
        System.out.println(myFloat);
        System.out.println(myLong);

        System.out.println("********");

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        System.out.println(myBool.booleanValue());
        System.out.println(myFloat.floatValue());
        System.out.println(myLong.longValue());

        System.out.println("********");

        String myString = myInt.toString();
        System.out.println(myString.length());

        String myString2 = myDouble.toString();
        System.out.println(myString2.length());

        String myString3 = myChar.toString();
        System.out.println(myString3.length());

        String myString4 = myBool.toString();
        System.out.println(myString4.length());

        String myString5 = myFloat.toString();
        System.out.println(myString5.length());

        String myString6 = myLong.toString();
        System.out.println(myString6.length());

    }
}
