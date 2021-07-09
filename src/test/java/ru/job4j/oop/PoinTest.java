package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PoinTest {
    @Test
    public void when00to20then2() {
        Point x = new Point(0, 0);
        Point y = new Point(2, 0);
        int expected = 2;
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to00then3() {
        Point x = new Point(1, 0);
        Point y = new Point(4, 0);
        int expected = 3;
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to40to00then3() {
        Point first = new Point(1, 0, 0);
        Point second = new Point(4, 0, 0);
        int expected = 3;
        double out = first.distance3D(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00to20then2() {
        Point first = new Point(0, 0, 2);
        Point second = new Point(0, 0, 0);
        int expected = 2;
        double out = first.distance3D(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
