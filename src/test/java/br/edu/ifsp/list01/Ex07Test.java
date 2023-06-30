package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex07Test {
    @ParameterizedTest
    @CsvSource({"100, 1.50, 1.25, 50, 75.00",
            "100, 1.50,  1.25, 150, 187.50",
            "87645, 687, 59, 3, 2061.00",
            "10, 2.0, 1.0, 10.10, 10.10",
            "0, 2.0, 1.0, 10, 10.00",
            "10, 2.0, 1.0, 9.90, 19.80",
            "100, 1.5, 1.0, 101, 101.00",
            "15687, 1587, 18699, 4587, 7279569.00",
            "100,  1.5, 1.0, 99.0, 148.50",
            "100, 1.5, 1.0, 100, 150.00"})
    void testCompute(int x, double v1, double v2, double a, double expected){
        Ex07 sut = new Ex07();
        assertThat(sut.compute(x, v1, v2, a)).isEqualTo(expected);
    }
}