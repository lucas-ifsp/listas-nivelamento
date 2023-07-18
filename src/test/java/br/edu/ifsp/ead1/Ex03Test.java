package br.edu.ifsp.ead1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex03Test {

    /*

     */

    @ParameterizedTest
    @CsvSource({
            "a, Sim",
            ", Sim",
            "subinoonibus, Sim",
            "reviver, Sim",
            "araraquara, Nao",
            "arara, Sim",
            "ab, Nao"
    })
    void testCompute(String input, String result){
        Ex03 sut = new Ex03();
        assertThat(sut.compute(input)).isEqualTo(result);
    }
}