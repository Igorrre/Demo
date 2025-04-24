package Homework_3;

import java.util.Random;

public class Practice_3_1 {

    public static void main(String[] args) {
/* Задача 1:
Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в
консоль.*/
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int n = random.nextInt(10);
            System.out.println((int) Math.pow(n, 2));
        }
    }
}