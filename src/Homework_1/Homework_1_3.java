package Homework_1;

public class Homework_1_3 {
    public static void main(String[] args) {

        int n = 171;
        int a = (n % 10) + (n / 100) + (n % 100) / 10;

        System.out.println("Сумма трехзначного числа = " + a);
    }
}