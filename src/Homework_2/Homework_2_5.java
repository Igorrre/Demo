package Homework_2;

import java.util.Scanner;

public class Homework_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            if (t > 0) {
                int sum = 0;
                for (int i = 1; i <= t; i++) {
                    sum = sum + i;
                }
                System.out.println(sum);
            } else
                System.out.println("Ошибка, вы ввели отрицательное число");
        } else
            System.out.println("Ошибка, вы ввели символ");
        scanner.close();
    }
}