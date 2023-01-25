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

        sortValues(zoo);
    }
    private static void sortValues(Map<Integer, String> zoo) {
        zoo.values().stream().sorted().forEach(System.out::println);
    }
}