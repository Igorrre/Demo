package Homework_5.Homework_5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем банкомат с начальными значениями купюр
        Bankomat bankomat = new Bankomat(10, 5, 2);
        // 10 купюр по 20, 5 купюр по 50, 2 купюры по 100

        // Отображаем текущий статус банкомата
        bankomat.showStatus();

        System.out.println("---------------------------------------------");

        /* Пробуем снять деньги (без сканера)
        bankomat.withdraw(270); // Ожидаем: 2 купюра по 100, 1 купюра по 50, 1 купюра по 20
        bankomat.withdraw(120); // Ожидаем: 1 купюра по 100, 1 купюра по 20
        bankomat.withdraw(50);  // Ожидаем: 1 купюра по 50
        bankomat.withdraw(-10);  // Ожидаем: ошибка, сумма должна быть положительной
        bankomat.withdraw(10);  // Ожидаем: ошибка, недостаточно средств для выдачи суммы
        */

        int add20 = 0, add50 = 0, add100 = 0; /* Здесь мы объявляем переменную и инициализируем ее значением 0.
        Это значение будет изменено позже, когда пользователь введет количество для пополнения.*/
        while (true) { // Бесконечный цикл до брейка
            System.out.print("Введите количество купюр номиналом 20 для добавления: ");
            if (scanner.hasNextDouble()) {
                add20 = scanner.nextInt();
                if (add20 >= 0) {
                    break;
                } else {
                    System.out.println("Ошибка: Введите положительное число.");
                }
            } else {
                System.out.println("Ошибка: Неверный ввод, введите число.");
                scanner.next(); // очистить неверный ввод
            }
        }

        while (true) {
            System.out.print("Введите количество купюр номиналом 50 для добавления: ");
            if (scanner.hasNextDouble()) {
                add50 = scanner.nextInt();
                if (add50 >= 0) {
                    break;
                } else {
                    System.out.println("Ошибка: Введите положительное число.");
                }
            } else {
                System.out.println("Ошибка: Неверный ввод, введите число.");
                scanner.next(); // очистить неверный ввод
            }
        }

        while (true) {
            System.out.print("Введите количество купюр номиналом 100 для добавления: ");
            if (scanner.hasNextDouble()) {
                add100 = scanner.nextInt();
                if (add100 >= 0) {
                    break;
                } else {
                    System.out.println("Ошибка: Введите положительное число.");
                }
            } else {
                System.out.println("Ошибка: Неверный ввод, введите число.");
                scanner.next(); // очистить неверный ввод
            }
        }

        bankomat.addMoney(add20, add50, add100);

        System.out.println("---------------------------------------------");

        // Отображаем текущий статус банкомата
        bankomat.showStatus();

        System.out.println("---------------------------------------------");

        // Добавляем деньги в банкомат (без сканера)
        //bankomat.addMoney(10, 5, 1); // Добавляем 10 купюр по 20, 5 купюры по 50, 1 купюру по 100

        //System.out.println("---------------------------------------------");

        // Отображаем текущий статус банкомата
        //bankomat.showStatus();

        // Снятие денег вручную
        int withdrawAmount = 0; /* Здесь мы объявляем переменную и инициализируем ее значением 0.
        Это значение будет изменено позже, когда пользователь введет сумму для снятия.*/
        while (true) {
            System.out.print("Введите сумму для снятия (положительное число, кратное 10): ");
            if (scanner.hasNextInt()) {
                withdrawAmount = scanner.nextInt();
                if (withdrawAmount > 0 && withdrawAmount % 10 == 0) {
                    break;
                } else {
                    System.out.println("Ошибка: сумма должна быть положительной и кратной 10.");
                }
            } else {
                System.out.println("Ошибка: введите целое число.");
                scanner.next();
            }
        }

        boolean success = bankomat.withdraw(withdrawAmount);
        if (!success) {
            System.out.println("Операция снятия не выполнена.");
        }

        System.out.println("---------------------------------------------");

        // Отображаем текущий статус банкомата
        bankomat.showStatus();

        scanner.close();
    }
}