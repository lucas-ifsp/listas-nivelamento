package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex10Test {
    @ParameterizedTest
    @CsvSource({"0,2,5,3,NAO", "0,3,4,2,SIM", "5763,4301,1928,4306,SIM", "21,6,47,3,NAO", "14,4,98,2,SIM",
            "43,2,70,2,NAO", "63,8,94,3,NAO", "1928,4306,5763,4301,SIM", "7271,2211,7915,2050,SIM",
            "1571,4240,9023,4234,SIM"})
    void testCompute(int x1, int v1, int x2,int v2, String expected){
        Ex10 sut = new Ex10();
        assertThat(sut.compute(x1, v1, x2, v2)).isEqualTo(expected);
    }
}