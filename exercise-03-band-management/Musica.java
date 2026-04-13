package org.example;

public class Musica {

    private String nome;
    private double duracao;

    public Musica (String nome, double duracao)
    {
        this.nome = nome;
        this.duracao = duracao;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setDuracao(double duracao){
        this.duracao=duracao;
    }

    public String getNome (){
        return this.nome;
    }

    public double getDuracao (){
        return this.duracao;
    }
}
