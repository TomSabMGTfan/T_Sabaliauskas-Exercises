package lt.techin;

public class PD4_3 {
    public static void main(String[] args) {
        //Parašykite programą, kuri demonstruoja &, |, îr bitinių operatorių naudojimą su sveikaisiais
        //skaičiais
        byte x = 3;
        int y = -5;

        if ((x > 0) & (y > 0)) {
            System.out.println("Both x and y are positive.");
        }
        else {
            System.out.println("test1");
        }

        if ((x > 0) | (y > 0)){
            System.out.println("One of them is positive.");
        }
        else {
            System.out.println("test2");
        }

    }
}
