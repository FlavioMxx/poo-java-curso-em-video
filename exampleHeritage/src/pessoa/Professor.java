package pessoa;

import java.math.BigDecimal;

public class Professor extends Pessoa{
    private String especialidade;
    private BigDecimal salario;

/*    public Professor(String nome, Integer idade, String sexo, String especialidade, BigDecimal salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }*/

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void receberAumento(BigDecimal aumento) {
        this.setSalario(this.getSalario().add(aumento));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", especialidade=" + especialidade +
                ", salario=" + salario;
    }
}

