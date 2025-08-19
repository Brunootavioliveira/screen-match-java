package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;
    private String sinopse;

    public Title(String nome, int anoLancamento, int duracaoMinutos, String sinopse) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracaoMinutos = duracaoMinutos;
        this.sinopse = sinopse;
    }

    public Title(String nome, int anoLancamento, String sinopse) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.sinopse = sinopse;
    }

    public Title() {
    }

    public Title(TitleOmdb meuFilmeOmdb) {
        this.nome = meuFilmeOmdb.title();
        this.anoLancamento = Integer.valueOf(meuFilmeOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuFilmeOmdb.runtime().substring(0,3));
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    } //Pegar o valor para mandar para a main
    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void exibiFichaTecnica () {}

    public void avalia(double nota) { //Para somar as avaliacoes e (void porque só vai registrar as notas) e precisa passar um argumento
        somaAvaliacoes += nota;
        totalAvaliacao++;
    }

    public double pegaMediaAvaliacoes() { //Método double pq precisa retornar uma média
        return somaAvaliacoes / totalAvaliacao;
    }

    @Override
    public int compareTo(Title outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Title: " + nome + "\n" +
                "Year: " + anoLancamento + "\n" +
                "Runtime: " + duracaoMinutos;
    }
}


