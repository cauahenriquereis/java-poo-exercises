package org.example;

public class Comprador {

    private String nome;
    private double saldo;
    private double totalCompra;

    public Comprador (String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        brownie.addCarrrinhoDeCompras();
        totalCompra += brownie.calculaValorTotalCompra();
        brownie.calculaValorTotalCompra();
        System.out.println("Efetuada a compra do browine do tipo: " + brownie.nome);
        System.out.println("Total até agora: R$ " + totalCompra);
    }
}
