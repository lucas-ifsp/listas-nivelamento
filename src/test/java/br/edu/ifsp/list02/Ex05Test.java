package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex05Test {

/*


--
*/

    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
        4, 4, 1, 3 | 2
        3, 2, 1, 3 | 2
        9, 2, 2, 5, 3, 1, 1, 5, 3, 4, 9, 8, 2, 2, 5, 2, 3, 8, 8, 0, 2, 3, 7, 0, 8, 7, 2, 6, 5, 6 | 2
        2, 2, 5, 5, 8, 8 | 2
        4, 4, 4, 5, 8, 9, 0, 5, 1, 5, 1, 6, 8, 7, 3, 9, 0, 7, 1, 8, 5, 4, 5, 0, 1, 2, 0, 4, 1, 4, 5, 6, 1, 2, 6, 7, 7, 0, 6, 7, 0, 2, 7, 2, 4, 4, 7, 2, 9, 0, 4, 2, 9, 9, 8, 7, 4, 8, 6, 1, 1, 9, 5, 4, 8, 9, 4, 7, 1, 6, 5, 5, 9, 4, 4, 8, 8, 0, 9, 9, 9, 8, 8, 2, 1, 9, 8, 6, 1, 4, 7, 6, 1, 6, 9, 0, 0, 6, 1, 4 | 13
        65, 47, 13, 86, 52, 10, 28, 76, 7, 3, 35, 19, 18, 3, 58, 80, 57, 12, 9, 99, 55, 78, 76, 53, 67, 23, 8, 37, 11, 16, 16, 34, 80, 95, 37, 85, 5, 74, 93, 37, 58, 31, 13, 89, 97, 62, 47, 16, 27, 82, 24, 67, 21, 11, 68, 49, 71, 63, 81, 41, 98, 4, 27, 18, 26, 92, 39, 23, 4, 21, 60, 81, 22, 82, 4, 97, 89, 62, 78, 91, 14, 25, 82, 57, 53, 81, 56, 5, 96, 21, 14, 25, 34, 85, 13, 56, 38, 73, 26, 16, 88, 18, 77, 87, 97, 65, 80, 78, 16, 35, 76, 42, 6, 13, 45, 33, 65, 72, 55, 20, 20, 58, 26, 41, 91, 29, 74, 25, 53, 24, 63, 30, 15, 12, 82, 19, 74, 26, 75, 97, 55, 24, 4, 37, 32, 43, 29, 47, 84, 61, 64, 72, 92, 57, 1, 74, 10, 30, 89, 72, 9, 23, 87, 83, 9, 24, 9, 66, 66, 86, 36, 12, 68, 15, 63, 60, 80, 98, 44, 23, 8, 86, 21, 20, 41, 68, 39, 96, 82, 1, 99, 54, 18, 68, 13, 55, 52, 7, 65, 16 | 2
        1, 2, 3 | 1
        10 | 1
        2, 2, 2, 2, 2 | 5
        18, 90, 90, 13, 90, 75, 90, 8, 90, 43, 5 | 5
    """)
    void testCompute(String input, int expected){
        Ex05 sut = new Ex05();
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