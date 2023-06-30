package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex07Test {

    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
        7 | 5 | 3 | 4 | 3 | 4 | S
        10 | 10 | 6 | 6 | 6 | 6 | N
        398 | 402 | 613 | 234 | 8 | 529 | N
        571 | 63 | 203 | 9 | 72 | 17 | S
        162 | 705 | 384 | 110 | 52 | 321 | S
        347 | 206 | 234 | 90 | 68 | 22 | S
        571 | 172 | 868 | 974 | 705 | 509 | N
        940 | 745 | 188 | 391 | 550 | 566 | S
        60 | 300 | 262 | 58 | 2 | 38 | S
        517 | 224 | 649 | 395 | 576 | 322 | N
    """)
    void testCompute(int x, int y, int l1, int h1, int l2, int h2, String expected){
        Ex07 sut = new Ex07();
        assertThat(sut.compute(x, y, l1, h1, l2, h2)).isEqualTo(expected);
    }
}