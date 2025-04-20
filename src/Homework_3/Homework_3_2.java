package Homework_3;

import java.util.Arrays;

public class Homework_3_2 {

    public static void main(String[] args) {

        /* Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
*/

// Буду честен, с этой задачей помог справится ИИ (сам до конца не разобрался).

        int[] mass = {9, 9, 9};
        System.out.println("На входе: " + Arrays.toString(mass));
        int[] result = plusOne(mass);
        System.out.println("На выходе: " + Arrays.toString(result));
    }

    public static int[] plusOne(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            if (mass[i] < 9) { // Если текущее число меньше 9
                mass[i]++; // Увеличиваем на 1
                return mass; // И возвращаем массив
            }
            mass[i] = 0; // Превращаем 9 в 0 и продолжаем дальше
        }
        // Если все цифры были равны 9, создаем новый массив с начальным элементом 1
        int[] newNumber = new int[mass.length + 1];
        newNumber[0] = 1; // Первая цифра будет 1
        return newNumber; // И возвращаем новый массив
    }
}