package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Toby", 20);
        Mamifero lontra = new Lontra("Lontra", 10);
        Mamifero boi = new Boi("BOB", 50);

        cachorro.emitirSom();
        lontra.emitirSom();
        boi.emitirSom();

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();


    }
}