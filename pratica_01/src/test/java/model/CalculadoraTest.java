package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void testeFatorial() {
        /* Testa o retorno do método fatorial para uma entrada 3, esperando um resultado igual a 6. */
        Calculadora calc = new Calculadora();
        int result = calc.fatorial(3);
        assertEquals(6, result);
    }

}