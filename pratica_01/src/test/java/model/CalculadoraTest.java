package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void testeFatorial() {
        Calculadora calc = new Calculadora();
        int result = calc.fatorial(3);
        assertEquals(6, result);
    }

}