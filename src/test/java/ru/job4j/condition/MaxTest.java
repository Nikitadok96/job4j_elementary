package ru.job4j.condition;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To100Then100() {
        int left = 0;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To15To20Then20() {
        int first = 10;
        int second = 15;
        int three = 20;
        int expected = 20;
        int result = Max.max(first, second, three);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To15To2To0Then15() {
        int first = 10;
        int second = 15;
        int three = 2;
        int four = 0;
        int expected = 15;
        int result = Max.max(first, second, three, four);
        assertThat(result).isEqualTo(expected);
    }
}