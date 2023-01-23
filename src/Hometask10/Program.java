package Hometask10;

import java.util.HashMap;
import java.util.Map;


public class Program {
    public static void main(String[] args) {

        Map<String,String> people = new HashMap<>();
        people.put("name", "Bob");
        people.put("age", "26");
        people.put("city", "New York");
        people.put("job", "Developer");

        System.out.println(people.keySet());







    }

    public static void collection (){
        Map<String,String> people = new HashMap<>();
        System.out.println(people.values());

    }
}
