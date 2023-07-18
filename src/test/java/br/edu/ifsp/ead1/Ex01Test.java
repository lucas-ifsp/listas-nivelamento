package br.edu.ifsp.ead1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Ex01Test {

    @ParameterizedTest
    @CsvSource({
            "Java, J*Ja*Jav*Jav*Ja*J",
            "POOS3, P*PO*POO*POOS*POOS*POO*PO*P",
            "araraquara, a*ar*ara*arar*arara*araraq*araraqu*araraqua*araraquar*araraquar*araraqua*araraqu*araraq*arara*arar*ara*ar*a",
            ", Invalido",
            "j, Invalido",
            "Ja, J*J"
    })
    void testCompute(String input, String result){
        Ex01 sut = new Ex01();
        assertThat(sut.compute(input)).isEqualTo(result);
    }
}