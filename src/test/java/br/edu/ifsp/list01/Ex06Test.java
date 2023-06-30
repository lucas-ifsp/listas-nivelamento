package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex06Test {
    @ParameterizedTest
    @CsvSource({"10.0,2.0,5.0,7.0,3 15.00",
            "4.0,3.0,5.0,3.0,4 20.00",
            "10.0,2.0,5.0,6.6,4 20.00",
            "1.0,1.0,100.0,100.0,1 100.00",
            "1.0,1.0,100,0.0001,10000 1000000.00",
            "1578.0,45.00,56.57,9865.36,8 452.56",
            "1560.0,0.00,1548,45678,0 0.00",
            "2.0,2.0,1.0,1.0,4 4.00",
            "4578.0,5851.0,0.0,5.0,5357176 0.00",
            "2.0,2.0,10.0,1.99,3 30.00"})
    void testCompute(double L, double a, double c, double m, String expected){
        Ex06 sut = new Ex06();
        assertThat(sut.compute(L, a, c, m)).isEqualTo(expected);
    }
}