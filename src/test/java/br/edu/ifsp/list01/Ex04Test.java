package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex04Test {
    @ParameterizedTest
    @CsvSource({"10,2,5,6", "12,4,4,3","8467,5,2,2539", "43203,60,5,864","6,2,2,4", "12,2,2,9","1000,10,10,111"})
    void testCompute(int n, int c, int m, int expected){
        Ex04 sut = new Ex04();
        assertThat(sut.compute(n, c, m)).isEqualTo(expected);
    }
}