package Homework_5.Homework_5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreditCard creditCard1 = new CreditCard("Master", 1, 10000);
        CreditCard creditCard2 = new CreditCard("Visa", 2, 20000);
        CreditCard creditCard3 = new CreditCard("Mir", 3, 30000);

        System.out.println("Текущая информация по картам: ");
        creditCard1.showInfo();
        creditCard2.showInfo();
        creditCard3.showInfo();

        System.out.println();
        System.out.println("Операции по картам: ");

//         //Пример без сканера:
//         //Пополнение карт Master и Visa
//        creditCard1.deposit( 500);
//        creditCard2.deposit(444.0);
//         //Снятие с карты MiR
//        creditCard3.withdraw(777.0);

        // Запрашиваем сумму для пополнения первой карты
        double amount1 = 0; /* Здесь мы объявляем переменную и инициализируем ее значением 0.
        //Это значение будет изменено позже, когда пользователь введет сумму для снятия.*/
        while (true) {
            System.out.print("Введите сумму для пополнения первой карты (положительное число): ");
            if (scanner.hasNextDouble()) {
                amount1 = scanner.nextDouble();
                if (amount1 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: Введите положительное число.");
                }
            } else {
                System.out.println("Ошибка: Неверный ввод, введите число.");
                scanner.next(); // очистить неверный ввод
            }
        }
        // Запрашиваем сумму для пополнения второй карты
        double amount2 = 0;
        while (true) {
            System.out.print("Введите сумму для пополнения второй карты (положительное число): ");
            if (scanner.hasNextDouble()) {
                amount2 = scanner.nextDouble();
                if (amount2 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: Введите положительное число.");
                }
            } else {
                System.out.println("Ошибка: Неверный ввод, введите число.");
                scanner.next();
            }
        }
        // Запрашиваем сумму для снятия третей карты
        double amount3 = 0;
        while (true) {
            System.out.print("Введите сумму для снятия с третьей карты (положительное число): ");
            if (scanner.hasNextDouble()) {
                amount3 = scanner.nextDouble();
                if (amount3 > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: Введите положительное число.");
                }
            } else {
                System.out.println("Ошибка: Неверный ввод, введите число.");
                scanner.next();
            }
        }
        System.out.println();
        // Вывод информации по снятию и пополнению
        creditCard1.deposit(amount1);
        creditCard2.deposit(amount2);
        creditCard3.withdraw(amount3);

        System.out.println();
        System.out.println("Информация по картам после операций с балансом: ");

        creditCard1.showInfo();
        creditCard2.showInfo();
        creditCard3.showInfo();

        scanner.close();

    }
}