package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    } //Pegar o valor para mandar para a main
    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } // Nome DESTE objeto, ganha nome, instanciado na classe main

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    // Criando metodo para a classe br.com.alura.screenmatch.modelos.Filme ja exibir a ficha tecnica
    //void sozinho no metodo = avisando o java para não devolver nada, só criar (ficha tecnica do filme)
    //Funçao dentro de uma classe = Método

    public void exibiFichaTecnica () {
        System.out.println("Nome do filme: " + nome); // Não precisa mais de varialvel para buscar os atributos do filme, pq estamos dentro da classe
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) { //Para somar as avaliacoes e (void porque só vai registrar as notas) e precisa passar um argumento
        somaAvaliacoes += nota;
        totalAvaliacao++;
    }

    public double pegaMediaAvaliacoes() { //Método double pq precisa retornar uma média
        return somaAvaliacoes / totalAvaliacao;
    }

}
