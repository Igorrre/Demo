package Homework_2;

import java.util.Scanner;

public class Homework_2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите температуру на улице t =  ");
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            if (t > -5) {
                System.out.println("Warm");
            } else if (t <= -5 && t > -20) {
                System.out.println("Normal");
            } else if (t >= -20) {
                System.out.println("Cold");
            }
        } else
            System.out.println("Введитие число, а не букву");
        scanner.close();
    }
}