package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Banda banda = new Banda("Os imortais", "Rock'n Roll");
        Membro membro = new Membro("Michael Jackson", "Vocalista");
        Membro membro1 = new Membro("Elvis Presley", "Vocalista");
        Musica musica = new Musica ("Solidão", 3.15);
        Musica musica1 = new Musica ("Happiness", 7.18);
        Empresario empresario = new Empresario("Caua",1022868462);

        banda.addMembroNovo(membro);
        banda.addMembroNovo(membro1);
        banda.addMusicaNova(musica);
        banda.addMusicaNova(musica1);

        banda.setEmpresario(empresario);


        banda.mostraInfo();


    }
}