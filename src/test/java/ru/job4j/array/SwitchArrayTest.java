package ru.job4j.array;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1To6() {
        int[] input = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 1;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[] {0, 6, 2, 3, 4, 5, 1, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}