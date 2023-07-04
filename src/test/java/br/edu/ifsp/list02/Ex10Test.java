package br.edu.ifsp.list02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex10Test {
    @ParameterizedTest
    @CsvSource(delimiterString = "|", textBlock = """
        1 | 1 | 180 | 45 | 4 | (-2,-2)
        0 | 0 | 0 | 0 | -1 | Erro
        0 | 0 | 45 | 45 | 5 | (0,5)
        10 | 10 | 45 | 45 | 10 | (10,20)
        -4 | 4 | 45 | 135 | 4  | (0,4)
        0 | 0 | 0 | 135 | 4 | (3,-3)
        0 | 0 | 0 | 0 | 0 |  (0,0)
    """)
    void testCompute(int x, int y, int a, int f, int d, String expected){
        Ex10 sut = new Ex10();
        assertThat(sut.compute(x, y, a, f, d)).isEqualTo(expected);
    }
}