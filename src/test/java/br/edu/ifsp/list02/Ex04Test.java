package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex04Test {
    @ParameterizedTest
    @CsvSource(delimiterString = "=>", textBlock = """
        0 0 0 1 => 2
        0 0 1 1 => 1
        1 0 0 0 => 1
        1 1 1 0 => 2
        1 1 0 1 => 1
        1 1 1 1 => 0
        1 0 0 0 => 1
        1 0 1 0 => 0
        1 0 0 1 => 1
        1 0 1 1 => 2
        0 1 0 0 => 2
        0 1 1 0 => 1
        0 1 0 1 => 0
        0 1 1 1 => 1
        0 0 0 0 => 0
        0 0 1 0 => 1
    """)
    void testCompute(String input, int expected){
        Ex04 sut = new Ex04();
        assertThat(sut.compute(input)).isEqualTo(expected);
    }
}