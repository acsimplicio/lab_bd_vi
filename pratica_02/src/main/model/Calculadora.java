package model;

public class Calculadora {

    public int fatorial(int n) {
        /* Realiza o cálculo do fatorial através do método recursivo. Para cada chamada de fatorial(n),
        o resultado será múltiplicado pelo valor de n anterior. */
        return n * fatorial(n - 1);
    }

}