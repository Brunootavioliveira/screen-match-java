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

    @Override
    public void exibiFichaTecnica () {
        System.out.println("Nome do filme: " + getNome()); // Não precisa mais de varialvel para buscar os atributos do filme, pq estamos dentro da classe
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Duração em minutos: " + getDuracaoMinutos());
        System.out.println("Diretor: " + getDirector());
        System.out.println("Sinopse: " + getSinopse());
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoLancamento() + ")";
    }

    public Filme(String nome, int anoLancamento, String director, int duraçãoMinutos, String sinopse) {
        super(nome, anoLancamento, duraçãoMinutos, sinopse);
        this.director = director;
    }
}
