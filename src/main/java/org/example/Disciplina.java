package org.example;

public class Disciplina {

    ICalcMedia calcMedia;
    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        Media = media;
    }

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public Disciplina() {
    }

    public Disciplina(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public void CalcularMedia(){
        Media = calcMedia.CalculaMedia(P1, P2);
        Situacao = calcMedia.Situacao(Media);
    }
}
