/**
 * Parašykite Java metodą, kuris skaičiuoja skaičiaus faktorialą.
 */

package lt.techin.tomas;

import java.math.BigInteger;

public class PD7_5 {
    public static void main(String[] args) {
        int number = 120000;
        System.out.println(countNumberFactorial(number));
    }

    public static BigInteger countNumberFactorial(int number){
        if (number < 0){
            return BigInteger.ZERO; //0
        } else {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++){
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        }
        //return null;
    }
}
