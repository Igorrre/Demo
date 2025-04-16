package Homework_2;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12: ");
        int month = scanner.nextInt();
        String season =
                switch (month) {
                    case 12, 1, 2 -> "Зима";
                    case 3, 4, 5 -> "Весна";
                    case 6, 7, 8 -> "Лето";
                    case 9, 10, 11 -> "Осень";
                    default -> "Такого месяца не существует";
                };
        System.out.println("Сезон: " + season);
        scanner.close();
    }
}