package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex01Test {
    @ParameterizedTest
    @CsvSource({"21 10 13 34 30 21 34, 3",
                "2 2 2 2 2 2 3, 1",
                "0 3 5 7 9 11 13, 4",
                "1 1 1 1 1 1 1, 0",
                "2 2 2 2 2 2 1, 6"})
    void testCompute(String input, String expected){
        Ex01 sut = new Ex01();
        assertThat(sut.compute(input)).isEqualTo(expected);
    }
}