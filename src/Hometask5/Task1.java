package Hometask5;

public class Task1 {
    public static void main(String[] args) {

        for(int i = 0;i <= 360;i+=10){
            System.out.println("sin("+ i + ")"  + " = " + calculateSin(i));
        }

    }

    public static double calculateSin(double x){
        double y = Math.sin(x);
        return y;
    }
}
