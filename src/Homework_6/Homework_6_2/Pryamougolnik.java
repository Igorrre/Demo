package Homework_6.Homework_6_2;

class Pryamougolnik extends Figura {
    private final double width;
    private final double height;

    public Pryamougolnik(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}