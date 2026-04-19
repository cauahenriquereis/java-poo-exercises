package org.example;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite( String nome, double preco,String sabor){
        super(nome,preco,sabor);
    }

    public void addDocedeLeite(){
        System.out.println("Adicionando mais doce de leite");
    }

    @Override
    public void addCarrrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho de compras brownie do tipo doce de leite");
    }


}
