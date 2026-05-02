package org.example;

public abstract class Veiculo implements Comparable <Veiculo>{

    private String nome;
    private int velMax;

    public Veiculo(String nome, int velMax){
        this.nome = nome;
        this.velMax = velMax;
    }

    @Override
    public int compareTo(Veiculo o) {
        if (this.velMax < o.velMax){
            return 1;
        }
        if (this.velMax > o.velMax){
            return -1;
        }
       return 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVelMax() {
        return velMax;
    }
}

