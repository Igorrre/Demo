package Homework_6.Homework_6_2;

/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */

public class Main {
    public static void main(String[] args) {
        Figura[] figures = new Figura[5];

        figures[0] = new Treugolnik(3, 4, 5);
        figures[1] = new Pryamougolnik(4, 6);
        figures[2] = new Krug(5);
        figures[3] = new Treugolnik(6, 8, 10);
        figures[4] = new Pryamougolnik(7, 3);

        double sumPerimeters = 0;

        for (Figura figura : figures) {
            sumPerimeters += figura.perimeter();
        }
        System.out.println();
        System.out.println("Суммарный периметр всех фигур: " + sumPerimeters);

        System.out.println();

        for (int i = 0; i < figures.length; i++) {
            Figura figura = figures[i];
            System.out.println("Фигура " + (i + 1) + ":");
            System.out.println("Площадь: " + figura.area());
            System.out.println("Периметр: " + figura.perimeter());
            System.out.println();
        }
    }
}