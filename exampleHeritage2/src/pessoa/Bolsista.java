package pessoa;

public final class Bolsista extends Aluno{
    public Double bolsa;

    public Double getBolsa() {
        return bolsa;
    }

    public void setBolsa(Double bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovada");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Bolsista " + this.getNome() + " pagou a mensalidade");
    }
}
