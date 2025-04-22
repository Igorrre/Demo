package Homework_2;

import java.util.Scanner;

public class Homework_2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        String result = (a % 2 == 0) ? "Четное" : "Не четное";
        System.out.println(result);
        scanner.close();
        }
    }