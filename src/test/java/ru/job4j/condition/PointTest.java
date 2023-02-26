package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {
    @Test
    public void when12To46Then5() {
        Point a = new Point(1, 2);
        Point b = new Point(4, 6);
        double expected = 5;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when11To14Then3() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 4);
        double expected = 3;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when00To00Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when000To003Then3() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 3);
        double expected = 3;
        double rsl = a.distance3d(b);
        assertThat(rsl).isCloseTo(expected, offset(0.00001));
    }

    @Test
    public void when010To110Then1() {
        Point a = new Point(0, 1, 0);
        Point b = new Point(1, 1, 0);
        double expected = 1;
        double rsl = a.distance3d(b);
        assertThat(rsl).isCloseTo(expected, offset(0.00001));
    }
}