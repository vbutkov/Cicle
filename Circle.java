package ru.vbutkov.product.star;

public class Circle {

    private double radius;
    private final double DEFAULT_RADIUS = 1.0;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0)
            setDefaultRadius();
        else
            this.radius = radius;
    }

    private void setDefaultRadius() {
        this.radius = DEFAULT_RADIUS;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}

//    Задача со звёздочкой: добавьте проверку, что радиус больше нуля и дополнительные тесты в классе TestCircle.