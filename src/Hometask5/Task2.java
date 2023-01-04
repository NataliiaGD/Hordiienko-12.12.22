package Hometask5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int [] intArray = new int[10];
        for(int i = 0;i < intArray.length; i++){
            intArray[i] = randomNumbers();
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
}
