import pessoa.Aluno;
import pessoa.Funcionario;
import pessoa.Pessoa;
import pessoa.Professor;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Aluno pessoa2 = new Aluno();
        Professor pessoa3 = new Professor();
        Funcionario pessoa4 = new Funcionario();

        pessoa1.setNome("Flavio");
        pessoa2.setNome("Jullya");
        pessoa3.setNome("Maria");
        pessoa4.setNome("Cecilia");

        pessoa1.setSexo("M");
        pessoa4.setSexo("F");

        pessoa2.setIdade(21);

        pessoa2.setCurso("Análise e desenvolvimento de sistemas");
        pessoa3.setSalario(new BigDecimal(3000));
        pessoa4.setSetor("PIX");

        pessoa3.receberAumento(new BigDecimal("1250.99"));


        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());
    }
}