package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Title implements Classificavel {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMediaAvaliacoes() / 2;
    }
}
