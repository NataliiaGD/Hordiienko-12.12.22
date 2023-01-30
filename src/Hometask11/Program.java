package Hometask11;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");

        printWordsWithFirstLetterA(fruits);
        printWordsLengthMoreThanFour(fruits);
        printSumOfFirstThreeWords(fruits);
    }

    private static void printWordsWithFirstLetterA(List<String> fruits) {
        fruits.stream().filter(x->x.startsWith("a")).forEach(System.out::println);
    }
    private static void printWordsLengthMoreThanFour(List<String> fruits) {
        fruits.stream().filter(x->x.length()>4).forEach(System.out::println);
    }
    private static void printSumOfFirstThreeWords(List<String> fruits) {
        int x = fruits.stream().limit(3).mapToInt(String::length).sum();
        System.out.println(x);
    }
}
