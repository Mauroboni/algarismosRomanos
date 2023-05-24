package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConversorTest {
    Conversor c;

    @BeforeEach
    void setUp() {
        c = new Conversor();
    }
    
    @Test
    public void verificarConversaoParaDecimal() {
        assertEquals(1937, c.romanoParaInteiro("MCMXXXVII"), "O resultado esperado não é igual ao obtido!");
    }


}
