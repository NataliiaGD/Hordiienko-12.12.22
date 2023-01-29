package Hometask10;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Integer,String> zoo = new HashMap<>();
        zoo.put(1,"monkey");
        zoo.put(2,"tiger");
        zoo.put(3,"zebra");
        zoo.put(4,"pig");
        zoo.put(5,"straus");

        sortByValues(zoo);
    }

    private static void sortByValues(Map<Integer, String> zoo) {
        zoo.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}