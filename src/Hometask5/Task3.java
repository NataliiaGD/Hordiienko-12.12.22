package Hometask5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] intArray = generateIntArray(10);
        System.out.println(calculateAverage(intArray));

    }

    public static int randomNumbers (){
        Random random = new Random();
        return random.nextInt(10);
    }

    public static  int[] generateIntArray(int lenght){
        int [] intArray = new int[lenght];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomNumbers();
        }

        return intArray;
    }

    public static double calculateAverage(int [] intArray){
        double sum = 0;
        for(int i = 0;i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        double average = sum/intArray.length;
        return average;
    }

}
