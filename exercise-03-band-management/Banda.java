package org.example;

public class Banda {

    private String nome;
    private String genero;
    private Membro membros [] = new Membro[5];
    private Musica musicas [] = new Musica[5];
    private Empresario empresario;

    public void setEmpresario(Empresario empresario)
    {
        this.empresario = empresario;
    }

    public Banda(String nome, String genero)
    {
        this.nome = nome;
        this.genero = genero;
    }

    public void addMusicaNova(Musica musica)
    {
        for (int i = 0; i<this.musicas.length; i++)
        {
            if (musicas[i] == null)
            {
                this.musicas[i] = musica;
                break;
            }
        }

    }

        public void addMembroNovo(Membro membro)
        {
            for (int i = 0; i<this.membros.length; i++)
            {
                if (membros[i] == null)
                {
                    this.membros[i] = membro;
                    break;
                }
            }
        }

    public void mostraInfo()
    {
        for(Musica musica: this.musicas)
        {
            if(musica != null)
            {
                System.out.println(musica.getNome());
            }
        }

        for(Membro membro: this.membros)
        {
            if(membro != null)
            {
                System.out.println(membro.getNome());
            }
        }

        if(this.empresario != null)
        {
            System.out.println(empresario.getNome() + " " + empresario.getCnpj());
        }

    }




}
