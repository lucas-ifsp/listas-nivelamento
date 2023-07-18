package br.edu.ifsp.ead1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex04Test {
    @ParameterizedTest
    @CsvSource({
            "aaabb, bbbaa, Nao",
            "amor, roma, Sim",
            "goiaba, amora, Nao",
            "ator, tora, Sim",
            "assim, missa, Sim",
            "m, m, Sim",
            "mm, mm, Sim"
    })
    void testCompute(String wordA, String wordB, String result){
        Ex04 sut = new Ex04();
        assertThat(sut.compute(wordA, wordB)).isEqualTo(result);
    }
}