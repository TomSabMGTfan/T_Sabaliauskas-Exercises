package lt.techin.tomas;

import java.util.Random;

public class PD8_1_1_RandomArrayGenerator {
    public int[] generateRandom(int size){
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++){
            randomNumbers[i] = random.nextInt();
        }
        return randomNumbers;
    }
}
