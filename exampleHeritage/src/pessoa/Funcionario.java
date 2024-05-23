package pessoa;

public class Funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

/*    public Funcionario(String nome, Integer idade, String sexo, String setor, Boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }*/

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudaTrabalho(){
        if (this.getTrabalhando()) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", setor='" + setor +
                ", trabalhando=" + trabalhando;
    }
}
