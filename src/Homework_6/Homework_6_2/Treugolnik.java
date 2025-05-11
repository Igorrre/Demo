package Homework_6.Homework_6_2;

class Treugolnik extends Figura {
    private final double a;
    private final double b;
    private final double c; // стороны треугольника

    public Treugolnik(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}