package Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_3_3 {

    public static void main(String[] args) {
/* Задача 3:
3.1 Создать пустой массив типа double с названием masDouble такого размера,
который пользователь вводит с клавиатуры.
3.2 Заполнить masDouble рандомными числами, используя Math.random() и
вывести его в консоль.
3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в
прямом и обратном порядке.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива = ");
        int size = scanner.nextInt();
        double[] massDouble = new double[size];
        for (int i = 0; i < massDouble.length; i++) {
            massDouble[i] = (Math.random() * 10);
        }
        System.out.println(Arrays.toString(massDouble));

        for (int i = 1; i < massDouble.length; i++) {
            if (i % 2 == 0) {
                massDouble[i] = Math.pow(massDouble[i], 2);
            }
        }
        System.out.println(Arrays.toString(massDouble));

        for (int i = massDouble.length - 1; i >= 0; i--) {
            System.out.print(massDouble[i] + " ");
        }
    }
}