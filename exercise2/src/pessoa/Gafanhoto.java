package pessoa;

public class Gafanhoto extends Pessoa{
    private String login;
    private Integer totAssistido;

    public Gafanhoto(String nome, String sexo, Integer idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(Integer totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected void ganharExp() {
        this.setExperiencia(getExperiencia() + 5);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
}
