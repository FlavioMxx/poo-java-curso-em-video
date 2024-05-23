package pessoa.visualizacao;

import pessoa.Gafanhoto;
import video.Video;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.filme.setVisualizacoes(this.filme.getVisualizacoes() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar() {
        this.getFilme().setAvaliacao(5);
    }

    public void avaliar(Integer nota) {
        this.getFilme().setAvaliacao(nota);
    }

    public void avaliar(Double porcentagem) {
        int tot = 0;

        if(porcentagem <= 20) {
            tot = 0;
        } else if(porcentagem <= 50) {
            tot = 5;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }

        this.getFilme().setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
