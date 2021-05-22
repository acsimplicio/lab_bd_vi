package model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void testeFatorialPositivo() {
        /* Testa o retorno do método fatorial para uma lista de entradas positivas, esperando que em nenhum caso, retorne o valor 0. */
        Calculadora calc = new Calculadora();

        List<Integer> entradas = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> saidas = new ArrayList<>();

        for (int entrada : entradas) {
            saidas.add(calc.fatorial(entrada));
        }
        assertFalse(saidas.contains(0));
    }

    @Test
    public void testeFatorialNegativo() {
        /* Testa o retorno do método fatorial para o primeiro valor da partição inválida, -1, espera-se o retorno 0. */
        Calculadora calc = new Calculadora();
        int retorno = calc.fatorial(-1);
        assertEquals(retorno, 0);
    }

}