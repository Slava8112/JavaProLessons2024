package com.telran.prof.lesson.lessontwelve;
import java.util.HashMap;
import java.util.Map;

public class ExampleMapOne {
    public static void main(String[] args) {
        String test = "dfsdkfjsdkfhksdfjksdfskdjfhyrfgefyerkjfnkfasdlkdsnksa";
        ExampleMapOne exampleMapOne = new ExampleMapOne();
        Map<Character, Integer> mapOne = exampleMapOne.countLettersInString(test);
        printMap(mapOne);

        Map<Character, Integer> mapTwo = exampleMapOne.countLettersInStringTwo(test);
        printMap(mapTwo);
    }

    private static void printMap(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println("Letter " + pair.getKey() + " contains " +
                    pair.getValue() + " times");
        }
    }

    public Map<Character, Integer> countLettersInString(String test) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {
            //Поочередно получаем символы из строки
            char temp = test.charAt(i);
            //Проверяем что ключ в виде такого символа есть в мапе
            if (map.containsKey(temp)) {
                //Если ключ есть, получаем значение количества по этому ключу
                int value = map.get(temp);
                //Помещаем обратно значение увеличенное на 1 по этому же ключу
                map.put(temp, value + 1);
            } else {
                //если ключа нет, то добавляем его со значением 1
                map.put(temp, 1);
            }
        }

        return map;
    }

    public Map<Character, Integer> countLettersInStringTwo(String test) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {
            //Поочередно получаем символы из строки
            char temp = test.charAt(i);
            //Получает значение по ключу, если ключа нет, то возвращает
            //дефолтное значение и помещает обратно по этому же ключу
            //значение увеличенное на 1
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        return map;
    }
}
