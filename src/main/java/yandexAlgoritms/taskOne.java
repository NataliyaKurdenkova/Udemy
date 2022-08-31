package yandexAlgoritms;


/**
 * Как найти наиболее часто встречающийся символ в строке с помощью Java?
 */

import org.springframework.util.StringUtils;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/*
Дана строка (в кодировке UTF-8) Найти самый часто встречающийся в ней символ.
Если несколько символов встречаются одинаково часто, то можно вывести любой
 */
public class taskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        countChar(str);
        countChar2(str);
        countChar3(str);

    }
    //ВАРИАНТ 1
    public static void countChar(String str){
        //Сосчитали количество символов и сохранили в хэшмапе
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
                System.out.println("1) Символ - "+"\'"+entry.getKey()+"\'"+" встречается "+max+" раз(а)");
            }
        }

    }
    //ВАРИАНТ 2
    public static void countChar2(String str) {
        // Алгоритм О(N в квадрате) так как 2 цикла for - два раза пробегаемся по все строке
        String s=""; //Символ, чаще всего встречающийся в тексте для начала ""
        int anscnt=0; // Он повторяется в тексте 0 раз
        for(int i=0;i<str.length();i++){ //пробегаемся по всем символам
            int nowcnt=0; //  количество раз сколько встречалась буква
            for(int j=0;j<str.length();j++){//пробегаемся по всему тексту
                if(str.charAt(i)==str.charAt(j)) //есдли мы нашли символ равный искомому,
                    nowcnt++;                   // то увеличиваем переменную на 1
                if(nowcnt>anscnt){              //если количество повторов начальное больше чем то. что встречается в тексте
                    s= String.valueOf(str.charAt(i));//запоминаем символ, который чаще встечается в тексте
                    anscnt=nowcnt; // запоминаем количество раз, которое оно встречается в тексте
                }
            }

        }
        System.out.println("2) Символ \'"+s +"\' встречается "+ anscnt + " раз(а)");
    }

    public static void countChar3(String str) {
        //ВАРИАНТ 3
        //находим в часто встречающийся символ
        char s= str.chars()
                .mapToObj(x -> (char) x)                  // box to Character
                .collect(groupingBy(x -> x, counting()))  // collect to Map<Character, Long>
                .entrySet().stream()
                .max(comparingByValue())                  // find entry with largest count
                .get()                                    // or throw if source string is empty
                .getKey();

        //считаем сколько раз он встречается в строке
        int anscnt=  StringUtils.countOccurrencesOf(str, String.valueOf(s));
        System.out.println("3) Символ \'" + s + "\' встречается " + anscnt+ " раз(а)");

    }

    //ВАРИАНТ 4
    // сложность О(N*K), если в строке у нас N букв, при этом различных букв K

}
