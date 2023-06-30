package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex03Test {

    private static Stream<Arguments> arguments() {

        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 6, 2, 3, 4, 5, 7, 6, 7}, """
                        1 2 3 4 5
                        2 3 4 5
                        2 3 4 5 6
                        3 4 5 6
                        4 5 6
                        5 6
                        6
                        6 7
                        7"""),
                Arguments.of(new int[]{1, 2, 2, 3, 4}, new int[]{}, "Erro"),
                Arguments.of(new int[]{30, 2, 39, 45, 89}, new int[]{44, 31, 2, 45, 81, 30, 39, 89, 44, 31, 81}, """
                        30 2 39 45 89
                        30 2 39 45 89 44
                        30 2 39 45 89 44 31
                        30 39 45 89 44 31
                        30 39 89 44 31
                        30 39 89 44 31 81
                        39 89 44 31 81
                        89 44 31 81
                        44 31 81
                        31 81
                        81"""),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}, """
                        1 2 3 4 5
                        1 2 3 4 5 6
                        1 2 3 4 5 6 7
                        1 2 3 4 5 6 7 8
                        1 2 3 4 5 6 7 8 9
                        1 2 3 4 5 6 7 8 9 10"""),
                Arguments.of(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}, """
                        1 2 3 4 5
                        2 3 4 5
                        3 4 5
                        4 5
                        5""")
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void testCompute(int[] firstFive, int[] otherInts, String expected){
        Ex03 sut = new Ex03();
        assertThat(sut.compute(firstFive, otherInts)).isEqualTo(expected);
    }
}