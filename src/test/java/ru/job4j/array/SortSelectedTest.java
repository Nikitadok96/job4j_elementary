package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenLength3Sort() {
        int[] data = new int[] {5, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenLength5Sort() {
        int[] data = new int[] {2, 11, 7, 1, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 7, 11};
        assertThat(result).containsExactly(expected);
    }
}