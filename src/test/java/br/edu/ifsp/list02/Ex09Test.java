package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex09Test {

    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
        20 | 22  |  5 | 20  | 10 | S
        80 | 50  | 30 | 40  | 60 | S
        80 | 50  | 30 | 60  | 40 | S
        80 | 30  | 70 | 40  | 60 | N
        80 | 30  | 50 | 60  | 40 | S
        80 | 70  | 50 | 60  | 40 | N
        80 | 70  | 30 | 40  | 60 | N
        18 | 60  | 45 | 48  | 25 | S
        30 | 50  | 80 | 80  | 60 | S
        75 | 100 | 50 | 100 | 30 | N
    """)
    void testCompute(int a, int b, int c, int h, int l, String expected){
        Ex09 sut = new Ex09();
        assertThat(sut.compute(a, b, c, h, l)).isEqualTo(expected);
    }
}