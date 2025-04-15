package Homework_1;

public class Homework_1_1 {
    public static void main(String[] args) {

        int b = 5;
        double c = 2.579;

        //Варианты ассоциотивности:
        double a1 = 4 * ((b + c - 1) / 2);
        double a2 = (4 * (b + c - 1)) / 2;

        System.out.println("a1="+a1);
        System.out.println("a1="+(int)a1);
        System.out.println("a2="+(float)a2);
    }
}
