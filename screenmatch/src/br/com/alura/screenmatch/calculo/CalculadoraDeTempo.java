package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void inclui(Series s) {
//        this.tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclui(Title titulo) {
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
