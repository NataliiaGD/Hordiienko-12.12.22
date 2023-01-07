package Hometask5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int [] intArray = generateIntArray(10);
        for(int i = 0;i < intArray.length; i++){
            if(intArray[i] % 2 == 0){
                intArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(intArray));

    }


    public static int randomNumbers (){
        Random random = new Random();
        return random.nextInt(10);
    }

    public static int[] generateIntArray(int lenght){
        int [] intArray = new int[lenght];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomNumbers();
        }
        return intArray;
    }
}
