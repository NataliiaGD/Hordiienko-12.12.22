package Hometask4;

public class PrintMonthInWord1 {
    public static void main(String[] args) {
        System.out.println(printMonthInWord(13));
    }

    public static String printMonthInWord(int dayOfMonth){
        if (dayOfMonth == 1) {
            return "JAN";
        } else if (dayOfMonth == 2) {
            return "FEB";
        } else if (dayOfMonth == 3) {
            return "MAR";
        } else if (dayOfMonth == 4) {
            return "APR";
        } else if (dayOfMonth == 5) {
            return "MAY";
        } else if (dayOfMonth == 6) {
            return "JUN";
        } else if (dayOfMonth == 7) {
            return "JUL";
        } else if (dayOfMonth == 8) {
            return "AUG";
        } else if (dayOfMonth == 9) {
            return "SEP";
        } else if (dayOfMonth == 10) {
            return "OCT";
        } else if (dayOfMonth == 11) {
            return "NOV";
        } else if (dayOfMonth == 12) {
            return "DEC";
        } else {
            return "Not a valid month";
        }
    }
}

