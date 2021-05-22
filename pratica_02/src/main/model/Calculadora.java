package model;

public class Calculadora {

    public int fatorial(int n) {
        /* Realiza o cálculo do fatorial através do método recursivo. Para cada chamada de fatorial(n),
        o resultado será múltiplicado pelo valor de n anterior. */
        if (validarEntrada(n)) {
            if (n == 0) {
                return 1;
            }
            return n * fatorial(n - 1);
        } else {
            return 0;
        }
    }

    private boolean validarEntrada(int n) {
        /* Valida a entrada dada ao método fatorial, caso a entrada seja menor de 0, é inválida. */
        if (n < 0) {
            return false;
        }

        return true;
    }

}