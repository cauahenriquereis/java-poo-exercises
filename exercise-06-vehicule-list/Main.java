package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

        Carro carro1 = new Carro("Jetta", 250);
        Carro carro2 = new Carro("Ferrari", 320);
        Moto moto1 = new Moto("Kawasaki", 330);
        Moto moto2 = new Moto("MT09", 280);
        Caminhao caminhao1 = new Caminhao("Scania", 210);
        Caminhao caminhao2 = new Caminhao("Optimus prime", 500);

        listaVeiculos.add(carro1);
        listaVeiculos.add(carro2);
        listaVeiculos.add(moto1);
        listaVeiculos.add(moto2);
        listaVeiculos.add(caminhao1);
        listaVeiculos.add(caminhao2);

        Collections.sort(listaVeiculos);

        System.out.println("Lista de todos os veículos ordenados em ordem descrescente por velocidade máxima");
        System.out.println("-------------------------------");
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo.getNome() + " -> Velocidade máxima: " + veiculo.getVelMax());
        }

        System.out.println("-------------------------------");

        Collections.reverse(listaVeiculos);
        System.out.println("Lista de todos os veículos ordenados em ordem crescente por velocidade máxima");
        System.out.println("-------------------------------");
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo.getNome() + " -> Velocidade máxima: " + veiculo.getVelMax());
        }
        System.out.println("-------------------------------");

        Veiculo maisVeloz = Collections.max(listaVeiculos);
        System.out.println("O veículo mais veloz é: " + maisVeloz.getNome() + " -> " + maisVeloz.getVelMax());

        Veiculo maisLento = Collections.min(listaVeiculos);
        System.out.println("O veículo mais lento é: " +  maisLento.getNome() + " -> " + maisLento.getVelMax());

    }


}