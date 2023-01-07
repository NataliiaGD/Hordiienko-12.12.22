package Hometask4;

public class Magnitude {
    public static void main(String[] args) {
        System.out.println(calculateMagnitude(-9,-8 ));
    }

    public static String calculateMagnitude (int a,int b){

        String str = " has bigger magnitude";

        if (Math.abs(a) > Math.abs(b)) {
            return a + str;
        }
        else if  (Math.abs(a) < Math.abs(b)) {
            return b + str;
        }
        else if (Math.abs(a) == Math.abs(b)){
            return "numbers are equal";
        }
        return str;
    }
}
