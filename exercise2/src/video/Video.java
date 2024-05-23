package video;

public class Video implements AcoesVideo{
    private String titulo;
    private Integer avaliacao;
    private Integer visualizacoes;
    private Integer curtidas;
    private Boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.visualizacoes = 0;
        this.avaliacao = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public Integer getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(Integer visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        int novaAvaliacao = (this.avaliacao + avaliacao) / this.visualizacoes;
        this.avaliacao = novaAvaliacao;
    }

    @Override
    public void play() {
        if(!this.getReproduzindo()){
            System.out.println("Play");
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if(this.getReproduzindo()) {
            System.out.println("Pause");
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", visualizacoes=" + visualizacoes +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
