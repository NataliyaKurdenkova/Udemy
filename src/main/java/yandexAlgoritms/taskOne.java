package yandexAlgoritms;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Дана строка (в кодировке UTF-8) Найти самый часто встречающийся в ней символ.
Если несколько символов встречаются одинаково часто, то можно вывести любой
 */
public class taskOne {
    public static void main(String[] args) {
        String str = "Тренировки по алгоритмам от Яндекса.";

        //осчитали количество символов и сохранили в хэшмапе
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Integer n = map.get(str.charAt(i));
            if (n == null) map.put(str.charAt(i), 1);
            else map.put(str.charAt(i), ++n);
        }
        System.out.println("Map "+map);
        //выберем символ. который встречается чаще всего
        int max = 0;
        for (int n : map.values()) {
            if (max < n) {
                max = n;
            }
        }
//Выводим символы, которые встречаются чаще всего
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println("Символ - "+"\'"+entry.getKey()+"\'"+" встречается "+max+" раз(а)");
            }
        }

    }


}
