package Homework_1;

public class Homework_1_3 {
    public static void main(String[] args) {

        int n = 175;
        int a = (n % 10);
        int b = (n / 100);
        int c = (n % 100) / 10;
        int sum = a + b + c;

        System.out.println("Сумма трехзначного числа = " + sum);
    }
}