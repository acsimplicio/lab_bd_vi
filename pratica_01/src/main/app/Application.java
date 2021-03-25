package app;

import model.Calculadora;

public class Application {

    public static void main(String [] args) {
        Calculadora calc = new Calculadora();
        System.out.print(calc.fatorial(3));
    }
    
}