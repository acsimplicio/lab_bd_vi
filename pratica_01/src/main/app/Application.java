package app;

import model.Calculadora;

public class Application {

    public static void main(String [] args) {
        /* Método principal da aplicação, aqui instanciamos a classe Calculadora e chamamos o método fatorial
        para o valor 3, imprimindo o seu resultado. */
        Calculadora calc = new Calculadora();
        System.out.print(calc.fatorial(3));
    }
    
}