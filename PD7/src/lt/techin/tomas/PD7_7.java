/**
 * Parašykite Java metodą, kuris apverčia skaičių (Pvz.: 45 –> 54).
 */

package lt.techin.tomas;

public class PD7_7 {
    public static void main(String[] args) {
        //int number = 54; // 50 + 4
        int number = 1234567890;
        System.out.println(number);
        System.out.println(reverseNumber(number));
    }

    public static int reverseNumber(int number){
        int reverved = 0;
        while (number != 0){
            int remainder = number % 10;
            reverved = reverved * 10 + remainder;
            number = number / 10;

        }
        return reverved;
    }
}
