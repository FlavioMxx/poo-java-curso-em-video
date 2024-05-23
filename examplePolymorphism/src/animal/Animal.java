package animal;

public abstract class Animal {
    protected Double peso;
    protected Integer idade;
    protected Integer membros;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
