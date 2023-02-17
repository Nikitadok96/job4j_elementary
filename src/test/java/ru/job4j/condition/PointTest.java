package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    public void when12To46Then5() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 6;
        double expected = 5;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when11To14Then3() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 4;
        double expected = 3;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when00To00Then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}