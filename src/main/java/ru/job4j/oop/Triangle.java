package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        // semiPerimeter() - выполняет расчет полупериметра треугольника.
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        // проверяет возможно ли из сторон с длинами a, b и c построить треугольник.
        // Для этого сумма длин двух сторон должна быть строго больше третьей стороны,
        //  для всех возможных сочетаний.
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            /* написать формулу для расчета площади треугольника. */
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
}
