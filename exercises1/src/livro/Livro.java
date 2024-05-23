package livro;

import pessoa.Pessoa;
import publicacao.Publicacao;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private Integer totalPag;
    private Integer pagAtual; 
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, Integer totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(Integer totalPag) {
        this.totalPag = totalPag;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public void detalhes() {
        System.out.println("Livro: " + this.getTitulo()
                            + "\nAutor: " + this.getAutor()
                            + "\nQuantidade de páginas: " + this.getTotalPag()
                            + "\nE está " + (this.getAberto() ? "aberto" : "fechado!")
                            + "\nO(A) leitor(a) " + this.getLeitor().getNome() + " está na página " + this.getPagAtual()
                            + "\n============================================");
    }

    @Override
    public void abrir() {
        if(!this.aberto) {
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.aberto) {
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(Integer i) {
        if(this.getAberto()) {
            this.setPagAtual(getPagAtual() + i);

            if(this.getPagAtual() >= this.getTotalPag()) {
                System.out.println("Folheou até o fim do livro");
            }
        }
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() < this.getTotalPag() && this.getAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() >= 1 && this.getAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
