package Hometask4;

public class PrintMonthInWord2 {
    public static void main(String[] args) {
        System.out.println(printMonthInWord(14));
    }

    public static String printMonthInWord(int dayOfMonth) {
        String str = "";
        switch(dayOfMonth){
            case 1:
                str = "JAN";
                break;
            case 2:
                str = "FEB";
                break;
            case 3:
                str = "MAR";
                break;
            case 4:
                str = "APR";
                break;
            case 5:
                str = "MAY";
                break;
            case 6:
                str = "JUN";
                break;
            case 7:
                str = "JUL";
                break;
            case 8:
                str = "AUG";
                break;
            case 9:
                str = "SEP";
                break;
            case 10:
                str = "OCT";
                break;
            case 11:
                str = "NOV";
                break;
            case 12:
                str = "DEC";
                break;
            default:
                str = "Not a valid date";
        }

        return str;
    }
}
