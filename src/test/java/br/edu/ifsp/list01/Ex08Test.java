package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex08Test {
    @ParameterizedTest
    @CsvSource({"5,3,8", "4,676,2698", "100,100,5050", "9343,1647,1364824", "1647,9343,14032440",
            "2,10,19", "1,10,10", "10,2,11", "10,1,10", "3,3,6"})
    void testCompute(int n, int c, int expected){
        Ex08 sut = new Ex08();
        assertThat(sut.compute(n, c)).isEqualTo(expected);
    }
}