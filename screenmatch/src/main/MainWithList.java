package main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithList {
    public static void main(String[] args) {
        var meuFilme = new Filme("The Matrix", 1999, "Lana e Lilly Wachowski", 136,
                "Um hacker descobre que o mundo em que vive é uma simulação criada por máquinas e se junta à resistência para libertar a humanidade.");
        meuFilme.avalia(9);
        var meuFilme2 = new Filme("Avengers", 2012, "Joss Whedon", 143,
                "Um grupo de super-heróis se une para proteger a Terra de uma invasão alienígena iminente.");
        meuFilme.avalia(2);
        var meuFilme3 = new Filme("Avatar", 2009, "James Cameron", 163,
                "Explorando uma raça desconhecida de outro planeta.");
        meuFilme3.avalia(6);
        var minhaSerie = new Series("Breaking Bad", 2008, 5, 12, 50,
                "Um professor com câncer terminal entra no mundo do tráfico de drogas para sustentar sua família e acaba se tornando um poderoso criminoso.");

        var minhaSerie2 = new Series("Mr. Robot", 2015, 4, 11, 50,
                "Um jovem programador com transtornos mentais é recrutado por um grupo hacker para derrubar corporações corruptas, enquanto enfrenta seus próprios demônios internos.");

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(minhaSerie);
        for ( Title item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme)
                System.out.println("Classificao: " + filme.getClassificacao());
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Julia");
        buscarPorArtista.add("Bruno");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscarPorArtista);
        System.out.println("-------------------");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Title::getAnoLancamento));
        System.out.println(lista);
    }
}

