import pessoa.*;

public class Main {
    public static void main(String[] args) {

       /* Visitante visitante = new Visitante();
        visitante.setNome("Flavio");
        visitante.setSexo("M");
        visitante.setIdade(23);
        System.out.println(visitante.toString());*/

        Aluno aluno = new Aluno();
        aluno.setNome("Jullya");
        aluno.setMatricula(12345678);
        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        aluno.setIdade(21);
        aluno.setSexo("F");
        aluno.pagarMensalidade();

        Bolsista bolsista = new Bolsista();
        bolsista.setMatricula(87654321);
        bolsista.setNome("Maria");
        bolsista.setBolsa(12.5);
        bolsista.setSexo("F");
        bolsista.pagarMensalidade();

        Tecnico tecnico = new Tecnico();
        tecnico.setMatricula(12121212);
        tecnico.setNome("Cecilia");
        tecnico.setCurso("NNDPP");
        tecnico.setRegistroProfissional("Estagio");
        tecnico.pagarMensalidade();
    }


}