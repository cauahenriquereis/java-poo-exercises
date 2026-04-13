    package br.inatel.poo;

    import br.inatel.poo.turmas.Aluno;
    import br.inatel.poo.turmas.Turma;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {

            Turma turma = new Turma();

            Aluno aluno = new Aluno();
            Aluno aluno1 = new Aluno();
            Aluno aluno2 = new Aluno();

            aluno.setNome("Caua");
            aluno.setMatricula("2237");
            aluno.setNotas(new double[]{89.6,43.7,94.5});

            aluno1.setNome("Caue");
            aluno1.setMatricula("1489");
            aluno1.setNotas(new double[]{54.7,25.8,89.6});

            aluno2.setNome("Caio");
            aluno2.setMatricula("5879");
            aluno2.setNotas(new double[]{54.9,21.8,14.9});

            turma.adicionarAluno(aluno);
            turma.adicionarAluno(aluno1);
            turma.adicionarAluno(aluno2);


            turma.listarAlunos();

            System.out.println("O melhor aluno da turma é: " + turma.buscarmelhorALuno().getNome() + " e sua media foi: " + turma.buscarmelhorALuno().CalculaMedia());

        }
        }
