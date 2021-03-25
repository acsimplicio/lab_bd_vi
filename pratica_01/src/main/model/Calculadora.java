package model;

public class Calculadora {

    public int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i = i + 1) {
            fat = fat * i;
        }

        return fat;
}

}