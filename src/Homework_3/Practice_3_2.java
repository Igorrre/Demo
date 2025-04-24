package Homework_3;

import java.util.Arrays;

public class Practice_3_2 {

    public static void main(String[] args) {
/* Задача 2:
2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
2.2 вывести в консоль второй и четвертый.
2.3 вывести в консоль длину массива.
2.4 третий фрукт заменить на иной.
2.5 проверить результат в консоли.*/
        String[] fruits = {"apple", "cocos", "banan", "cherry"};
        System.out.println(fruits[1]);
        System.out.println(fruits[3]);
        System.out.println();
        System.out.println(fruits.length);
        System.out.println();
        fruits[2] = "lemon";
        System.out.println(Arrays.toString(fruits));
    }
}