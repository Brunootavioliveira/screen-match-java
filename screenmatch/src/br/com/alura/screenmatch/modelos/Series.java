package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Series extends Title implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int episodiosTemporada;
    private int minutosEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public int getMinutosEpisodios() {
        return minutosEpisodios;
    }

    public void setMinutosEpisodios(int minutosEpisodios) {
        this.minutosEpisodios = minutosEpisodios;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodiosTemporada * minutosEpisodios;
    }

    @Override
    public void exibiFichaTecnica() {
        System.out.println("Nome da série: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Sinopse: " + getSinopse());
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMediaAvaliacoes() / 2;
    }

    public Series(String nome, int anoLancamento, int temporadas, int episodiosTemporada, int minutosEpisodios, String sinopse) {
        super(nome, anoLancamento, sinopse);
        this.temporadas = temporadas;
        this.episodiosTemporada = episodiosTemporada;
        this.minutosEpisodios = minutosEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
    }
}
