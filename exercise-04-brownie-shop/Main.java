package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Brownie bwnutella = new BrownieNutella("Nutella", 8.5, "Nutella");
        Brownie bwcafe = new BrownieCafe("Café", 7.5, "Café");
        Brownie bwdocedeleite = new BrownieDoceDeLeite("Doce de Leite", 9.0, "Doce de leite");

        Comprador comprador = new Comprador("Caua", 17.5);

        comprador.efetuarCompra(bwcafe);
        comprador.efetuarCompra(bwnutella);
        comprador.efetuarCompra(bwdocedeleite);


    }

}