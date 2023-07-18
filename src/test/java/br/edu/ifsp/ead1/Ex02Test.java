package br.edu.ifsp.ead1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex02Test {
    @ParameterizedTest
    @CsvSource({
            "welcometojava, 3, ava wel",
            "welcometojava, 6, cometo welcom",
            "Instituto, 2, In ut",
            "Instituto, 0,",
            "Instituto, 9, Instituto Instituto",
            "Instituto, 10,"
    })
    void testCompute(String word, int number, String result){
        Ex02 sut = new Ex02();
        assertThat(sut.compute(word, number)).isEqualTo(result);
    }
}