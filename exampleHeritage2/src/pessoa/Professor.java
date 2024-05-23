package pessoa;

import java.math.BigDecimal;

public class Professor extends Pessoa{
    private String especialidade;
    private BigDecimal salario;

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
}
