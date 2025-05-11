package Homework_6.Homework_6_2;

class Krug extends Figura {
    private final double radius;

    public Krug(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}