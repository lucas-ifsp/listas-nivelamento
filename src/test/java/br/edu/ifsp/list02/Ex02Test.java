package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex02Test {
    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
        1 0 3 4 -2147483647 | 1 1 1 1 -500 | Erro
        1 0 3 4 -2147483647 | 1 1 1 1 0 | 2, 1, 4, 5, -2147483647
        1 0 3 4 2147483647 | 1 1 1 1 5 | Erro
        1 0 3 4 2147483640 | 4 3 9 0 500 | Erro
        2 5 8 34 5 | 8 51 2 16 5 | 10, 56, 10, 50, 10
        -10 0 10 20 30 | 100 50 0 -50 -100 | 90, 50, 10, -30, -70
    """)
    void testCompute(String line1, String line2, String expected){
        Ex02 sut = new Ex02();
        assertThat(sut.compute(stringToArray(line1), stringToArray(line2))).isEqualTo(expected);
    }

    private static int[] stringToArray(String arrayString) {
        String[] stringValues = arrayString.split(" ");
        int[] array = new int[stringValues.length];
        for (int i = 0; i < stringValues.length; i++) {
            array[i] = Integer.parseInt(stringValues[i]);
        }
        return array;
    }
}