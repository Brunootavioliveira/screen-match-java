package br.com.alura.screenmatch.modelos;

public class Title {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;
    private String sinopse;

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

}


