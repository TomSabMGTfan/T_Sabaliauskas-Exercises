/**
 * Parašykite Java metodą, kuris grąžina skaičiaus kvadratą.
 */

package lt.techin.tomas;

public class PD7_1 {
    public static void main(String[] args) {
        System.out.println(getNumPow(10));
    }

    //public static int getNumPow(int number){
    public static double getNumPow(int number){
        //return number * number;
        return Math.pow(number, 2.0);
    }
}
