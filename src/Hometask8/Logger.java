package Hometask8;

public enum Logger {
    INFO, DEBUG, WARN, ERROR;

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";

    public void logInfo(String str1){
        System.out.println(ANSI_GREEN + INFO + " " + str1);
    }
    public void logDebug(String str2){
        System.out.println(ANSI_BLUE + DEBUG + " " + str2);
    }
    public void logWarn(String str3){
        System.out.println(ANSI_PURPLE + WARN + " " + str3);
    }
    public void logError(String str4){
        System.out.println(ANSI_RED + ERROR + " " + str4);
    }



}
