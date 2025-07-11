import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme; // Referenciando a classe filme
import br.com.alura.screenmatch.modelos.Series;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Pegando a classe filme criada, e criando uma variavel passando a referencia dessa classe pra ela
        meuFilme.setNome("The Matrix"); // Atribuindo valor a as classes criadas
        meuFilme.setAnoLancamento(1999); // SET = para atribuir valor, de um atributo privated
        meuFilme.setDuracaoMinutos(135);
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoMinutos());

        Filme meuFilme2 = new Filme(); // Pegando a classe filme criada, e criando uma variavel passando a referencia dessa classe pra ela
        meuFilme2.setNome("Avengers"); // Atribuindo valor a as classes criadas
        meuFilme2.setAnoLancamento(2010); // SET = para atribuir valor, de um atributo privated
        meuFilme2.setDuracaoMinutos(195);

        /* System.out.println(meuFilme); Será impresso o nome da classe e o endereço do objeto
        System.out.println(meuFilme.nome); Se eu quiser acesso ao atributo do objeto criado, basta usar o nome da variavel com o .
        System.out.println(meuFilme.anoLancamento);
        Criando objeto na classe e INSTANCIANDO (usando NEW, para conseguir usar métodos e atributos de uma classe)

        Classe = uma planta de uma casa, uma especificacao de algo (todo filme vai ter nome),
        la só ta escrito que o filme vai ter nome
         New = Agora com o filme em maos (na memoria) que eu posso atribuir nome...
        */

        meuFilme.exibiFichaTecnica(); //Maneira mais facil, a própria classe, ja imprimi as informacoes para a main principal
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println("Soma do valor das avaliações: " + meuFilme.getSomaAvaliacoes());
        System.out.println("Total de avaliações feitas: " + meuFilme.getTotalAvaliacao());
        System.out.println("Média das avaliações: " + meuFilme.pegaMediaAvaliacoes());

        Series lost = new Series();
        lost.setNome("Lost");
        lost.setAnoLancamento(2020);
        lost.exibiFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosTemporada(10);
        lost.setMinutosEpisodios(50);
        System.out.println("Duração em minutos da série " + lost.getDuracaoMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumber(1);
        episodio.setSeries(lost);
        episodio.setTotalViews(300);
        filtro.filtra(episodio);
    }
}