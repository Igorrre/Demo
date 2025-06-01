package Homework_9;
/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3, 4, 4, 5".
Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
При решении использовать коллекции.
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки с числами
        System.out.println("Введите набор чисел, разделённых запятыми:");
        String input = scanner.nextLine();

        // Разделение строки по запятым и удаление лишних пробелов
        String[] numbers = input.split(",");// разбивает введенную пользователем строку (input) на массив строк (String[]
        Set<String> uniqueNumbers = new LinkedHashSet<>();
        // Используем LinkedHashSet, хранит уникальные элементы, но сохраняет порядок их добавления

        // Добавление элементов в множество для устранения повторов
        for (String num : numbers) {
            uniqueNumbers.add(num.trim()); // удаляем лишние пробелы с помощью trim()
        }
        // Вывод результата
        System.out.println("Результат без повторяющихся элементов:");
        System.out.println(String.join(", ", uniqueNumbers));
    }
}