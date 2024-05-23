package lutador;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer qtdVitoria;
    private Integer qtdDerrota;
    private Integer qtdEmpate;

    public Lutador(String nome, String nacionalidade, Integer idade, Double altura,
                   Double peso, Integer qtdVitoria, Integer qtdDerrota, Integer qtdEmpate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.qtdVitoria = qtdVitoria;
        this.qtdDerrota = qtdDerrota;
        this.qtdEmpate = qtdEmpate;

        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdEmpate() {
        return qtdEmpate;
    }

    public void setQtdEmpate(Integer qtdEmpate) {
        this.qtdEmpate = qtdEmpate;
    }

    public Integer getQtdDerrota() {
        return qtdDerrota;
    }

    public void setQtdDerrota(Integer qtdDerrota) {
        this.qtdDerrota = qtdDerrota;
    }

    public Integer getQtdVitoria() {
        return qtdVitoria;
    }

    public void setQtdVitoria(Integer qtdVitoria) {
        this.qtdVitoria = qtdVitoria;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(Double peso) {
        if(peso < 52.2 || peso > 120.2){
          this.categoria = "INVÁLIDO";
        } else if(peso <= 70.3) {
            this.categoria = "PESO LEVE";
        } else if(peso <= 83.9) {
            this.categoria = "PESO MÉDIO";
        } else {
            this.categoria = "PESO PESADO";
        }
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void apresentar() {
        System.out.println("Lutador " + getNome()
                            + "\n" + getIdade() + " anos"
                            + "\nPaís origem: " + getNacionalidade()
                            + "\ncom " + getAltura() + " de altura"
                            + "\ne pesando " + getPeso() + "Kg"
                            + "\n---------------------------------");
    }

    public void status() {
        Integer totLutas = getQtdDerrota() + getQtdEmpate() + getQtdVitoria();
        System.out.println(getNome()
                            + " possui um total de " + totLutas + " luta(s)"
                            + ", sendo " + getQtdVitoria() + " vitória(s), "
                            + getQtdDerrota() + " derrota(s) "
                            + "e " + getQtdEmpate() + " empate(s).");
    }

    public void ganharLuta() {
        this.setQtdVitoria(getQtdVitoria() + 1);
    //    System.out.println("Ganhou a luta!"); Está ficando estranho no console, com info duplicada!
    }

    public void perderLuta() {
        this.setQtdDerrota(getQtdDerrota() + 1);
    //    System.out.println("Perdeu a luta!"); Está ficando estranho no console, com info duplicada!
    }

    public void empatarLuta() {
        this.setQtdEmpate(getQtdEmpate() + 1);
    //    System.out.println("Empatou a luta!"); Está ficando estranho no console, com info duplicada!
    }
}
