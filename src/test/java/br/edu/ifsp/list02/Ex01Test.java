package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex01Test {
    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
        21, 10, 13, 34, 30, 21, 34 | 3
        2, 2, 2, 2, 2, 2, 3 | 1
        0, 3, 5, 7, 9, 11, 13 | 4
        1, 1, 1, 1, 1, 1, 1 | 0
        2, 2, 2, 2, 2, 2, 1 | 6
    """)
    void testCompute(String input, int expected){
        Ex01 sut = new Ex01();
        final int[] inputAsString = stringToArray(input);
        assertThat(sut.compute(inputAsString)).isEqualTo(expected);
    }

    private static int[] stringToArray(String arrayString) {
        String[] stringValues = arrayString.split(", ");
        int[] array = new int[stringValues.length];
        for (int i = 0; i < stringValues.length; i++) {
            array[i] = Integer.parseInt(stringValues[i]);
        }
        return array;
    }
}