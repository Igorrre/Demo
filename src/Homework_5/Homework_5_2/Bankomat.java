package Homework_5.Homework_5_2;

/*
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
 */
public class Bankomat {
    int count20;
    int count50;
    int count100;

    // Конструктор с параметрами
    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    // Метод для добавления денег в банкомат
    public void addMoney(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
        System.out.println("Деньги добавлены: " + count20 + " купюр по 20, " + count50 + " купюр по 50, " + count100 + " купюр по 100.");
    }

    // Метод для снятия денег
    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной.");
            return false;
        }

        int originalAmount = amount;
        int num100 = 0, num50 = 0, num20 = 0;

        // Сначала используем купюры по 100
        while (amount >= 100 && count100 > 0) {
            amount -= 100;
            count100--;
            num100++; // количество выданных купюр
        }

        // Затем используем купюры по 50
        while (amount >= 50 && count50 > 0) {
            amount -= 50;
            count50--;
            num50++;
        }

        // Наконец, используем купюры по 20
        while (amount >= 20 && count20 > 0) {
            amount -= 20;
            count20--;
            num20++;
        }

        // Проверяем, удалось ли выдать нужную сумму
        if (amount == 0) {
            System.out.println("Выдано: " + num20 + " купюр по 20, " + num50 + " купюр по 50, " + num100 + " купюр по 100.");
            return true;
        } else {
            // Если не удалось выдать нужную сумму, возвращаем купюры обратно
            count100 += num100;
            count50 += num50;
            count20 += num20;
            System.out.println("Недостаточно средств для выдачи суммы " + originalAmount + ".");
            return false;
        }
    }

    // Метод для отображения текущего состояния банкомата
    public void showStatus() {
        System.out.println("Текущий статус банкомата:");
        System.out.println("Количество купюр по 20: " + count20);
        System.out.println("Количество купюр по 50: " + count50);
        System.out.println("Количество купюр по 100: " + count100);
    }
}