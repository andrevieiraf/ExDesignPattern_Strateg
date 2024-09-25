package org.example;

import static java.lang.Math.sqrt;

public class Geometrica implements ICalcMedia{
    @Override
    public double CalculaMedia(double a, double b) {
        return sqrt(a*b);
    }

    @Override
    public String Situacao(double media) {
        if (media > 7){
            return "APROVADO";
        }
        return "REPROVADO";
    }
}
