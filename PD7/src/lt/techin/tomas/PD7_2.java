/**
 * Parašykite Java metodą, kuris konvertuoja Celsijaus laipsnius į Farenheitą.
 */

package lt.techin.tomas;

public class PD7_2 {
    public static void main(String[] args) {
        System.out.println(converCelsToFar(-15.6));
    }

    public static double converCelsToFar(double temperature) {
        return temperature * 1.8 + 32;
    }
}
