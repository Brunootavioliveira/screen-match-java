package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Title;

public class FiltroRecomendacao extends Title {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            if (classificavel instanceof Title) {
                Title titulo = (Title) classificavel;
                System.out.println("O " + titulo.getNome() + " Está entre os preferidos");
            }
        } else if (classificavel.getClassificacao() <= 2) {
            if (classificavel instanceof Title) {
                Title titulo = (Title) classificavel;
                System.out.println("O " + titulo.getNome() + " Bem avaliado no momento");
            }
        } else {
            if (classificavel instanceof Title) {
                Title titulo = (Title) classificavel;
                System.out.println("O " + titulo.getNome() + " Coloque na sua lista para assistir depois");
            }
        }
    }

}
