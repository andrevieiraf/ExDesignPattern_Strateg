package org.example;

public class Aritmetica implements ICalcMedia{
    @Override
    public double CalculaMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String Situacao(double media) {
        if (media > 5){
            return "APROVADO";
        }
        return "REPROVADO";
    }
}
