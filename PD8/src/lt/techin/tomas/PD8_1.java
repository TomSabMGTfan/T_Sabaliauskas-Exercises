package lt.techin.tomas;

/**
 * Sukurkite klasę / objektą kuris moka generuoti atsitiktinių skaičių masyvą. Masyvo dydis yra
 * pateikiamas kaip argumentas.
 */

import java.util.Arrays;

public class PD8_1 {
    public static void main(String[] args) {
        PD8_1_1_RandomArrayGenerator randomArrayGenerator = new PD8_1_1_RandomArrayGenerator();
        int[] myRandomNumbers = randomArrayGenerator.generateRandom(10);
        System.out.println(Arrays.toString(myRandomNumbers));
    }
}
