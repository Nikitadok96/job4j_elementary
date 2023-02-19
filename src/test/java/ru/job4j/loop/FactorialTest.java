package ru.job4j.loop;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int out = Factorial.calc(n);
        int expected = 1;
        assertThat(out).isEqualTo(expected);
    }
}