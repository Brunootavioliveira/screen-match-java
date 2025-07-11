import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("The Matrix");
        meuFilme.setAnoLancamento(1999);
        meuFilme.setDuracaoMinutos(136);
        meuFilme.setDirector("Lana e Lilly Wachowski");
        meuFilme.setSinopse("Um hacker descobre que o mundo em que vive é uma simulação criada por máquinas e se junta à resistência para libertar a humanidade.");
        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println("Soma do valor das avaliações: " + meuFilme.getSomaAvaliacoes());
        System.out.println("Total de avaliações feitas: " + meuFilme.getTotalAvaliacao());
        System.out.println("Média das avaliações: " + meuFilme.pegaMediaAvaliacoes());

        System.out.println("-----------------------------------------------------");

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Avengers");
        meuFilme2.setAnoLancamento(2012);
        meuFilme2.setDuracaoMinutos(143);
        meuFilme2.setDirector("Joss Whedon");
        meuFilme2.setSinopse("Um grupo de super-heróis se une para proteger a Terra de uma invasão alienígena iminente.");
        meuFilme2.exibiFichaTecnica();
        meuFilme2.avalia(6);
        meuFilme2.avalia(8);
        meuFilme2.avalia(4);
        System.out.println("Soma do valor das avaliações: " + meuFilme2.getSomaAvaliacoes());
        System.out.println("Total de avaliações feitas: " + meuFilme2.getTotalAvaliacao());
        System.out.println("Média das avaliações: " + meuFilme2.pegaMediaAvaliacoes());

        System.out.println("-----------------------------------------------------");

        Series minhaSerie = new Series();
        minhaSerie.setNome("Breaking Bad");
        minhaSerie.setAnoLancamento(2008);
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosTemporada(12);
        minhaSerie.setMinutosEpisodios(50);
        minhaSerie.setSinopse("Um professor com câncer terminal entra no mundo do tráfico de drogas para sustentar sua família e acaba se tornando um poderoso criminoso.");
        minhaSerie.exibiFichaTecnica();
        minhaSerie.avalia(8);
        minhaSerie.avalia(9);
        minhaSerie.avalia(8);
        System.out.println("Soma do valor das avaliações: " + minhaSerie.getSomaAvaliacoes());
        System.out.println("Total de avaliações feitas: " + minhaSerie.getTotalAvaliacao());
        System.out.println("Média das avaliações: " + minhaSerie.pegaMediaAvaliacoes());
        System.out.println("Duração em minutos da série " + minhaSerie.getDuracaoMinutos());

        System.out.println("-----------------------------------------------------");

        Series minhaSerie2 = new Series();
        minhaSerie2.setNome("Mr. Robot");
        minhaSerie2.setAnoLancamento(2015);
        minhaSerie2.setTemporadas(4);
        minhaSerie2.setEpisodiosTemporada(11);
        minhaSerie2.setMinutosEpisodios(50);
        minhaSerie2.setSinopse("Um jovem programador com transtornos mentais é recrutado por um grupo hacker para derrubar corporações corruptas, enquanto enfrenta seus próprios demônios internos.");
        minhaSerie2.exibiFichaTecnica();
        minhaSerie2.avalia(2);
        minhaSerie2.avalia(3);
        minhaSerie2.avalia(4);
        System.out.println("Soma do valor das avaliações: " + minhaSerie2.getSomaAvaliacoes());
        System.out.println("Total de avaliações feitas: " + minhaSerie2.getTotalAvaliacao());
        System.out.println("Média das avaliações: " + minhaSerie2.pegaMediaAvaliacoes());
        System.out.println("Duração em minutos da série " + minhaSerie2.getDuracaoMinutos());

        System.out.println("-----------------------------------------------------");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        System.out.println("Saiba duração total em minutos de todas as séries e filme: ");
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(minhaSerie);
        calculadora.inclui(minhaSerie2);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("-----------------------------------------------------");

        System.out.println("Saiba o quão recomendavel é sua série ou filme: ");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(meuFilme2);
        filtro.filtra(minhaSerie);
        filtro.filtra(minhaSerie2);



        Episodio episodio = new Episodio();
        System.out.println("....");
    }
}