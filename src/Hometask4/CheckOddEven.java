package Hometask4;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println(сheckOddEven(5));


    }

    public static String сheckOddEven(int number) {

        if (number % 2 > 0) {
           return "Odd number" + " BYE";
        }
        return "Even number" + " BYE";
    }
}
