package br.edu.ifsp.list01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex03Test {
    @ParameterizedTest
    @CsvSource({"4,Ano bissexto","5,Ano nao bissexto","1600,Ano bissexto", "2000,Ano bissexto", "2016,Ano bissexto",
    "1900,Ano nao bissexto", "2020,Ano bissexto", "100,Ano nao bissexto", "0,Erro"})
    void testCompute(int input, String expected){
        Ex03 sut = new Ex03();
        assertThat(sut.compute(input)).isEqualTo(expected);
    }
}