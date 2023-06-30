package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex05Test {

    @ParameterizedTest
    @CsvSource({"60,150.00,10.00,50,0.00", "90,3451.98,150.13,113,6904.97", "65,569.12,125.43,2000,243276.17",
    "0,10.00,10.45,10,114.50", "100,1050,18000.75,1,0.00", "100,100.00,100.00,101,200.00",
    "100,100.00,100.00,99,0.00","60,150.00,10.00,65,200.00","16758,3048.72,1000.00,85716,68961048.72",
            "100, 100.00, 100.00, 100, 0.00"})
    void testCompute(int L, double m, double a, int v, String expected){
        Ex05 sut = new Ex05();
        assertThat(sut.compute(L, m, a, v)).isEqualTo(expected);
    }
}