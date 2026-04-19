package org.example;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho");
    }

    public double calculaValorTotalCompra(){
        return this.preco;
    }

    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.sabor);
    }
}
