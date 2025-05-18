package Homework_8;

import java.util.Scanner;

/*
 Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
Например, "Hello" -> "HHeelllloo"
*/
public class Homework_8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String Str = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        // Проходим по каждому символу строки
        for (char c : Str.toCharArray()) {
            result.append(c).append(c); // добавляем символ дважды
        }
        System.out.println("Результат: " + result);
    }
}