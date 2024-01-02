package lt.techin;

public class PD3_8 {
    public static void main(String[] args) {
        //Parašykite programą, kuri atspausdina pateiktos išraiškos rezultatą:
        //7.5×6.5−4.5×3
        //47.5−5.5 =
        //12.78
        //15.4−2.75

        double leftResult = (7.5 * 6.5) - (4.5 * 3) / (47.5 - 5.5);
        double rightResult = 12.78 / (15.4 - 2.75);

        System.out.println(leftResult);
        System.out.println(rightResult);

        System.out.println(leftResult == rightResult);
        System.out.println(leftResult != rightResult);




    }
}
