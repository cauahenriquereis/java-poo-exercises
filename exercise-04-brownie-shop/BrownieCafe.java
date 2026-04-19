package org.example;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor){
        super(nome,preco,sabor);
    }

    public void addMaisCafe(){
        System.out.println("Adicionando mais cafe");
    }

    @Override
    public void addCarrrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho de compras brownie do tipo cafe");
    }
}
