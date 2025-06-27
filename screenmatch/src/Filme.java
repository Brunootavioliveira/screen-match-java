public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacoes;
    int totalAvaliacao;
    int DuracaoMinutos;

    // Criando metodo para a classe Filme ja exibir a ficha tecnica
    //void sozinho no metodo = avisando o java para não devolver nada, só criar (ficha tecnica do filme)
    //Funçao dentro de uma classe = Método

    void exibiFichaTecnica () {
        System.out.println("Nome do filme: " + nome); // Não precisa mais de varialvel para buscar os atributos do filme, pq estamos dentro da classe
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) { //Para somar as avaliacoes e (void porque só vai registrar as notas) e precisa passar um argumento
        somaAvaliacoes += nota;
        totalAvaliacao++;
    }

    double pegaMediaAvaliacoes() { //Método double pq precisa retornar uma média
        return somaAvaliacoes / totalAvaliacao;
    }
}
