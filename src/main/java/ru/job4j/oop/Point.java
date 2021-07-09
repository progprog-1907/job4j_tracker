package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private final int x;

    /**
     * Это поле тоже объекта. Оно доступно только конкретному объекту.
     */
    private final int y;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int z;

    /**
     * Конструктор, который принимает начальное состаяние объекта "точка"
     * @param first кординант x
     * @param second кординант y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор, который принимает начальное состаяние объекта "точка"
     * @param first кординант x
     * @param second кординант y
     * @param third кординант z
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }


    /**
     * Метод вычесляет расстояние между точками двухмерном простанстве
     * @param that заменяет x1, y1;
     * @return возвращает вычислению расстояние между точками двухмерном простанстве
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод вычисляет расстояние между точками трехмерным пространстве
     * @param that заменяет x1, y1, z1
     * @return возвращает вычислению между точками трехмерном пронстранстве
     */
    public double distance3D(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}
