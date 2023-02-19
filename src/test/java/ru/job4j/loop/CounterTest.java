package ru.job4j.loop;

import static org.assertj.core.api.Assertions.assertThat;
import  org.junit.jupiter.api.Test;

class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToTwoThenTwo() {
        int start = 0;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}