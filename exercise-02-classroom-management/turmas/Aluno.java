package br.inatel.poo.turmas;

public class Aluno {

    private String nome;
    private String matricula;
    private double[]notas = new double[5];

    public double CalculaMedia(){
        double soma = 0;
        int contador = 0;
        for(int i = 0; i < this.notas.length; i++){
                soma += this.notas[i];
                contador++;
            }
        double media = soma/contador;
        return media;
        }


    public void mostraInfo(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}

