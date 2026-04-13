package br.inatel.poo.turmas;

public class Turma {

    private int quantidadeAlunos;
    public Aluno alunos[] = new Aluno[5];

    public void adicionarAluno(Aluno aluno){
        for(int i = 0; i< this.alunos.length; i++) {
            if (this.alunos[i] == null){
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public void listarAlunos(){
        for(Aluno aluno: this.alunos)
        {
            if(aluno != null)
            {
                System.out.println(aluno.getNome());
            }
        }

    }



    public Aluno buscarmelhorALuno(){

        Aluno melhorAluno = this.alunos[0];
        for (int i = 1; i<this.alunos.length; i++){
            if(this.alunos[i] != null){
                if(this.alunos[i].CalculaMedia() > melhorAluno.CalculaMedia()) {
                    melhorAluno = this.alunos[i];
                }
            }
        }
        return melhorAluno;
    }
}
