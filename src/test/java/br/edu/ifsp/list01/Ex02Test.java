package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex02Test {
    @ParameterizedTest
    @CsvSource({"-1, 2, 3,Erro","1, 2, -3,Erro","1, -2, 3,Erro","1, 1, 1,Equilatero","1, 2, 0,Erro","1, 2, 3,Nao forma triangulo",
            "1, 2, 4,Nao forma triangulo", "3, 3, 3,Equilatero", "2, 3, 2,Isosceles", "0, 0, 0,Erro"})
    void testCompute(int a, int b, int c, String expected){
        Ex02 sut = new Ex02();
        assertThat(sut.compute(a, b, c)).isEqualTo(expected);
    }
}