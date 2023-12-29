package lt.techin;

public class PD3_1 {
    public static void main(String[] args) {

        byte myByte = 127; // 1 byte
        System.out.println("byte: " + myByte + "  |1 byte");

        short myShort = 32767; // 2 bytes
        System.out.println("Short: " + myShort + "  |2 bytes");

        int myInt = 2147483647; // 4 bytes
        System.out.println("int: " + myInt + "  |4 bytes");

        long myLong = 9223372036854775807L; // 8 bytes
        System.out.println("long: " + myLong + "  |8 bytes");

        float myFloat = 12.12345f; // 4 bytes
        System.out.println("float: " + myFloat + "  |4 bytes");

        double myDuoble = 99.987123d; // 8 bytes
        System.out.println("double: " + myDuoble + "  |8 bytes");

        boolean myBoolean = true; // 1 bit
        System.out.println("boolean: " + myBoolean + "  |1 bit");

        char myChar = 'T'; // 2 bytes
        System.out.println("char: " + myChar + "  |2 bytes");

        // byte, short, int, long, float, double, boolean, char
    }
}
