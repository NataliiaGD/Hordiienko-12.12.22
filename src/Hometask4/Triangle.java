package Hometask4;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangle(4,4,6));

    }

    public static boolean triangle (int a,int b,int c){

        if (a == b && a != c && b != c) {
           return true;
        }
        return false;
    }
}
