package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex04Test {
    @ParameterizedTest
    @CsvSource({"10,2,5,6", "12,4,4,3","8467,5,2,3385", "43203,60,5,899","6,2,2,5", "12,2,2,11","1000,10,10,111"})
    void testCompute(int n, int c, int m, int expected){
        Ex04 sut = new Ex04();
        assertThat(sut.compute(n, c, m)).isEqualTo(expected);
    }
}