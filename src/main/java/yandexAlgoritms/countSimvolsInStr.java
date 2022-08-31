package yandexAlgoritms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class countSimvolsInStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        countUniqueChar(str);
        countUniqueChar2(str);
        countUniqueChar3(str);

    }
    //ВАРИАНТ 1
    public static void countUniqueChar(String str){
        System.out.println(str.chars().distinct().count()); // считает количество уникальных символов в строке

    }
    //ВАРИАНТ 2
    public static void countUniqueChar2(String str){
        ArrayList<Character> unique = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++)
            if (!unique.contains(str.charAt(i)))
                unique.add(str.charAt(i));
        System.out.println(unique.size());

    }
    //ВАРИАНТ 3
    public static void countUniqueChar3(String word){
        Set<Character> wordSet = new HashSet<>();
        for(Character c : word.toCharArray())
            wordSet.add(c);
        System.out.println(wordSet.size());
    }
}
