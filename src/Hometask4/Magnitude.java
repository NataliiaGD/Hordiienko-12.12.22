package Hometask4;

public class Magnitude {
    public static void main(String[] args) {
        System.out.println(compareMagnitude(-9,-7 ));
    }

    public static String compareMagnitude (int a,int b){

        String str = " has bigger magnitude";

        if (Math.abs(a) > Math.abs(b)) {
            return a + str;
        }
        else if (Math.abs(a) < Math.abs(b)) {
            return b + str;
        }
        else if (Math.abs(a) == Math.abs(b)){
            return "numbers are equal";
        }
        return str;
    }
}
