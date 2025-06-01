package Homework_9;
/*
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

import java.util.HashMap;
import java.util.Map;

public class Homework_9_3 {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();// для подсчета сколько раз встречается каждое слово.
        Map<String, Boolean> resultMap = new HashMap<>();// для хранения результата: для каждого слова — true

        // Подсчет количества каждого слова
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        } //Для каждого слова:
//        Используем getOrDefault() — если слово уже есть в countMap, берем его счетчик, иначе — 0.
//        Прибавляем 1 и сохраняем обратно в countMap

        // Формирование итоговой карты
        for (String key : countMap.keySet()) {
            resultMap.put(key, countMap.get(key) >= 2);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}