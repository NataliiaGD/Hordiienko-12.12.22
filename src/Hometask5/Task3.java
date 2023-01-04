package Hometask5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] intArray = new int[10];
        double sum = 0;
        for(int i = 0;i < intArray.length; i++) {
            intArray[i] = randomNumbers();
            sum = sum + intArray[i];
        }

        double average = sum/intArray.length;
        System.out.println(average);

    }

    public static int randomNumbers (){
        Random random = new Random();
        return random.nextInt(10);
    }



}
