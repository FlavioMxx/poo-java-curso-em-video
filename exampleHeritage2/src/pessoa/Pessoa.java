package pessoa;

public abstract class Pessoa {
    private String nome;
    private String sexo;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public final void fazerANiversario() { //Graças a palavra final, esse método vai funcionar unica-exclusivamente assim, NINGUÉM que herde a classe pessoa pode sobrescrever este método.
        this.setIdade(getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
