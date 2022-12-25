package Hometask4;

public class Magnitude {
    public static void main(String[] args) {
        System.out.println(Math(-9,-8 ));
    }

    public static String Math (int a,int b){

        String str = " has bigger magnitude";

        if (Math.abs(a) > Math.abs(b)) {
            return a + str;
        }
        if (Math.abs(a) < Math.abs(b)) {
            return b + str;
        }
        if (Math.abs(a) == Math.abs(b)){
            return "numbers are equal";
        }
        return str;
    }
}
