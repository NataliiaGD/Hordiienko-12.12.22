package Hometask5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int [] intArray = generateIntArray(10);
        System.out.println(Arrays.toString(changeEvenNumbersToZero(intArray)));

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

    public static int [] changeEvenNumbersToZero(int [] intArray){
        for(int i = 0;i < intArray.length; i++){
            if(intArray[i] % 2 == 0){
                intArray[i] = 0;
            }
        } return intArray;
    }
}
