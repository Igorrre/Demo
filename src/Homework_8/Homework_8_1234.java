package Homework_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Homework_8_1234 {
    /*
    Задача 1:
    Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
    Вывести найденные строки и их длину.
    Задача 2:
    Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
    возрастания значений их длины.
    Задача 3:
    Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
    меньше средней, а также их длину
    Задача 4:
    Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
    Если таких слов несколько, найти первое из них.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.println("Задача 1:");
        String[] stringsMass1 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d: ", i + 1); // %d задает номер строки из массива строк
            stringsMass1[i] = scanner.nextLine();
        }
        // Инициализация переменных для хранения короткой и длинной строки
        String shortStr = stringsMass1[0];
        String longStr = stringsMass1[0];
        for (String s : stringsMass1) {
            if (s.length() < shortStr.length()) {
                shortStr = s;
            }
            if (s.length() > longStr.length()) {
                longStr = s;
            }
        }
        System.out.println("Самая короткая строка " +"\"" + shortStr + "\"" + ", длина: " + shortStr.length());
        System.out.println("Самая длинная строка " +"\"" + longStr +"\""+ ", длина: " + longStr.length());

        // Задача 2: Упорядочить строки по возрастанию длины
        System.out.println("\nЗадача 2:");
        String[] stringsMass2 = new String[3];
        // Ввод трёх строк
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d: ", i + 1);
            stringsMass2[i] = scanner.nextLine();
        }
        Arrays.sort(stringsMass2, Comparator.comparingInt(String::length)); // компаратор, сравнивающий строки по их длине.
        System.out.println("Строки в порядке возрастания длины:");
        for (String s : stringsMass2) {
            System.out.println("Строка " +"\""+ s + "\"" + " длина: " + s.length());
        }

        // Задача 3: Вывести строки, длина которых меньше средней
        System.out.println("\nЗадача 3:");
        String[] stringsMass3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d: ", i + 1);
            stringsMass3[i] = scanner.nextLine();
        }
        // Вычисление суммы длин строк
        int sum = 0;
        for (String s : stringsMass3) {
            sum += s.length();
        }
        double average = sum / 3.0;
        // Вывод строк, длина которых меньше средней
        System.out.println("Средняя длина строк (" + average + "):");
        for (String s : stringsMass3) {
            if (s.length() < average) {
                System.out.println("Строка " +"\"" + s +"\"" + " - длина меньше средней равна: " + s.length());
            }
        }

        // Задача 4: Найти слово, состоящее только из различных символов.
        // Если таких слов несколько, найти первое из них.
        System.out.println("\nЗадача 4:");
        String[] stringsMass4 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d: ", i + 1);
            stringsMass4[i] = scanner.nextLine();
        }
        String resultWord = null;
        // Обработка каждой строки
        for (String s : stringsMass4) {
            String[] words = s.split("\\s+"); // Разделение строки на слова по пробелам
            for (String word : words) {
                if (isAllUniqueChars(word)) {
                    resultWord = word;
                    break; // Нашли первое подходящее слово, выходим из цикла
                }
            }
            if (resultWord != null) {
                break; // Если нашли слово в текущей строке, дальше не ищем
            }
        }
        if (resultWord != null) {
            System.out.println("Первое слово из уникальных символов: " + resultWord);
        } else {
            System.out.println("Таких слов не найдено.");
        }
    }
    // Метод для проверки, что все символы в слове уникальны
    public static boolean isAllUniqueChars(String word) {
        boolean[] chars = new boolean[65536]; // Для всех возможных символов Unicode
        for (char c : word.toCharArray()) {
            if (chars[c]) {
                return false; // Символ уже встречался
            }
            chars[c] = true;
        }
        return true;
    }
}