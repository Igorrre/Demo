package Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3_1 {

    public static void main(String[] args) {
        /* Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива = ");
        int size = scanner.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(mass));

        //Задача 1:
        for (int i = 0; i < mass.length; i++) {
            // Этот код выполняется для каждого элемента
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        //Задача 2:
/* Первый вариант:
       int min = Arrays.stream(mass).min().getAsInt();
       int max = Arrays.stream(mass).max().getAsInt();
       System.out.println("Минимальное число: " + min);
       System.out.println("Максимальное число: " + max); */

        int max = mass[0]; // начальное значение максимального элемента
        int min = mass[0]; // начальное значение минимального элемента
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            } else if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Минимальное число: " + min + " " + "Максимальное число: " + max);

        //Задача 3:
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > mass[indexMax]) {
                indexMax = i;
            } else if (mass[i] < mass[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println("Минимальный индекс: " + indexMin + " " + "Максисмальный индекс: " + indexMax);

        //Задача 4:
        // Цикл for each:
        int count = 0;
        for (int value : mass) {
            if (value == 0) {
                count++;
            }
        }
        //Второй способ цикл for:
//        int count = 0;
//        for (int i = 0; i < mass.length; i += 1) {
//            if (mass[i] == 0) {
//                count ++;
//            }
//        }
        if (count > 0) {
            System.out.println("Количество нулей в массиве: " + count);
        } else {
            System.out.println("Нет нулевых элементов");
        }

        //Задача 5:

        /*
        Середину массива мы определяем как array.length / 2.
        В случае с чётным количеством элементов мы пройдём ровно первую половину элементов.
        В случае с нечётным количеством центральный элемент мы трогать не будем, т.к. при инверсии он остаётся на месте.
        */
        for (int i = 0; i < mass.length / 2; i++) {
            /*
            В цикле проходим по первой половине элементов и на каждой итерации меняем местами элемент с индексом i и элемент с таким же смещением,
            но с конца массива (array.length – i – 1).
            Чтобы обменять значения местами мы используем временную переменную.
            */
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(mass));

        //Задача 6:

        /*
        Cоздаем переменную - флажек, которая будет обозначать,
        является ли массив строго возрастающей последовательностью или нет.
        Изначально предполагаем, что является.
        */
        boolean flag = true;
        /*
        Внутри цикла мы прописали, что если следующий элемент массива меньше или равен предыдущему,
        тогда установить флаг false и выйти из цикла.
        */
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] <= mass[i - 1]) {
                flag = false;
                break;
            }
        }
        //Если флажек не изменился, значит массив возрастающий
        //Если изменился, значит нет
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
        scanner.close();
    }
}