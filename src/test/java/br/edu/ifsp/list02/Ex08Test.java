package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex08Test {

    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
        4, 6, 2 | S
        5, 3, 5, 3, 5, 3, 5, 3, 5, 3 | S
        3, 4, 5, 4, 3, 4, 5, 5, 5, 5, 2, 2, 2, 3, 2, 1, 4, 4, 5, 2, 2, 1, 4, 1, 2, 3, 1, 2, 4, 1, 1, 1, 4, 1, 4, 3, 5, 5, 3, 2, 3, 3, 2, 2, 2, 4, 2, 2, 2, 2, 1, 1, 1, 4, 5, 3, 3, 2, 3, 5, 2, 2, 5, 2, 1, 5, 4, 5, 2, 5, 1, 4, 4, 3, 1, 2, 4, 4, 1, 1, 3, 3, 2, 2, 5, 1, 4, 5, 5, 5, 1, 5, 5, 5, 4, 2, 2, 1, 1, 2 | S
        1, 6, 5, 6, 5, 1, 4, 2, 1, 6, 1, 6, 6, 1, 3, 2, 4, 1, 5, 1, 3, 3, 3, 1, 6, 1, 2, 2, 6, 2, 6, 2, 3, 2, 3, 1, 6, 6, 3, 2, 5, 5, 4, 2, 4, 3, 3, 1, 6, 2 | N
        2, 1, 4, 3, 2, 5, 1, 3, 2, 5, 1, 1, 1, 2, 2, 3, 3, 5, 2, 3, 5, 2, 5, 5, 4, 3, 2, 5, 5, 3, 2, 2, 2, 2, 1, 5, 1, 4, 3, 4, 3, 5, 2, 1, 4, 3, 4, 4, 4, 1 | S
        6, 6 | N
        2, 6, 4, 5, 7, 3, 4, 5, 2, 5 | S
        2, 6, 4, 5, 7, 3, 4, 5, 2, 6 | N
        2, 6, 4, 9, 7, 3, 4, 5, 2, 6 | N
        2, 4, 5, 5, 2, 4, 3, 5, 2, 4 | S
    """)
    void testCompute(String input, String expected){
        Ex08 sut = new Ex08();
        final int[] inputAsArray = stringToArray(input);
        assertThat(sut.compute(inputAsArray)).isEqualTo(expected);
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