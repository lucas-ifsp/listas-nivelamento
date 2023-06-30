package br.edu.ifsp.list01;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Ex01Test {

    @ParameterizedTest
    @CsvSource({"0,Erro", "19,Criterio B", "1,Criterio B", "-1,Erro",
            "5,Criterio B", "20,Indiferente", "21,Criterio A", "100,Criterio A"})
    void testCompute(int books, String result){
        Ex01 sut = new Ex01();
        assertThat(sut.compute(books)).isEqualTo(result);
    }
}