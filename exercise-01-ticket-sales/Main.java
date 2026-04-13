package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ingressointeiro,ingressoMeia;
        String valorInteiro,valorMeia;

        System.out.println("Entre com a quantidade de ingressos inteiros vendidos");
        ingressointeiro = teclado.nextInt();
        System.out.println("Entre com a quantidade de ingressos meia vendidos");
        ingressoMeia = teclado.nextInt();

        teclado.nextLine();
        System.out.println("Entre com o valor dos ingressos inteiros");
        valorInteiro = teclado.nextLine();
        float valorInteiro2 = Float.parseFloat(valorInteiro.replace(",", "."));

        System.out.println("Entre com o valor dos ingressos meia");
        valorMeia = teclado.nextLine();
        float valorMeia2 = Float.parseFloat(valorMeia.replace(",","."));

        float totalingressosInteiro = ingressointeiro * valorInteiro2;
        float totalingressosMeia = ingressoMeia * valorMeia2;
        float totalsessao = totalingressosMeia + totalingressosInteiro;
        float media = totalsessao / (ingressointeiro + ingressoMeia);

        System.out.printf("Valor total de ingressos Inteiro: %.2f\n", totalingressosInteiro);
        System.out.printf("Valor total de ingressos Meia: %.2f\n", totalingressosMeia);
        System.out.printf("Valor total da sessão %.2f\n" , totalsessao);
        System.out.printf("Media dos ingressos %.2f\n" , media);

        }



    }