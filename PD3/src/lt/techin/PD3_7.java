package lt.techin;

public class PD3_7 {
    public static void main(String[] args) {
        //Sukurkite programą, kuri deklaruoja String kintamuosius, atlieka su jais įvairias operacijas, pvz.,
        //sujungimą, palyginimą, dalies ištraukimą ir atspausdina rezultatus.
        String name = "Tomas";
        String surname = "Sabaliauskas";

        System.out.println("Sincerely, " + name + " " + surname);

        System.out.println("**************");
//Create a variable of type String and assign it a value:
        String greeting = "Hello";
        System.out.println(greeting);
        System.out.println("**************");
        //A String in Java is actually an object,
        // which contain methods that can perform certain operations on strings. For example,
        // the length of a string can be found with the length() method:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println("**************");
//There are many string methods available, for example toUpperCase() and toLowerCase():
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world
        System.out.println("**************");
        //lyginimas
        String text3 = "Tomas";
        String text4 = new String("Tom");
        System.out.println(text3.equals(text4));


    }
}
