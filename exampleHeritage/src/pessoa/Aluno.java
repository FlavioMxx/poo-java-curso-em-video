package pessoa;

import java.util.Random;

public class Aluno extends Pessoa{
    private Integer matricula;
    private String curso;


/*
    public Aluno(String nome, Integer idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;

        Random r = new Random();
        this.setMatricula(r.nextInt(1000000, 2000000));
    }
*/

    public Integer getMatricula() {
        return matricula;
    }

    private void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", matricula=" + matricula +
                ", curso=" + curso;
    }
}


