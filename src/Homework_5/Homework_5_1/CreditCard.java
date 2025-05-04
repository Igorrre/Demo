package Homework_5.Homework_5_1;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма. Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
*/

public class CreditCard {
    // Типы переменных
    String nameCard;
    int accountNumber;
    double currentAmount;

    // Конструктор для карт
    public CreditCard(String nameCard, int accountNumber, double currentAmount) {
        this.nameCard = nameCard;
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    // Метод пополнения
    public void deposit(double amount) {
        if (amount > 0) {
            currentAmount += amount;
            System.out.println("Пополнение " + amount + " по счету " + accountNumber);
        } else {
            System.out.println("Депозит должен быть положительным.");
        }
    }

    // Метод снятия
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Депозит должен быть больше чем сумма для снятия.");
        } else if (amount > currentAmount) {
            System.out.println("Недостаточно средств на счете " + accountNumber + " для снятия.");
        } else {
            currentAmount -= amount;
            System.out.println("Снятие " + amount + " с счета " + accountNumber);
        }
    }

    // Метод вывода информации по картам
    public void showInfo() {
        System.out.println("Название карты: " + nameCard);
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущая сумма: " + currentAmount);
        System.out.println("-------------------------------");
    }
}