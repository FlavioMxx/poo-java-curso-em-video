package luta;

import lutador.Lutador;

import java.util.Random;

public class Luta {

    public static final int MINIMO_ROUNDS = 4;
    public static final int MAXIMO_ROUNDS = 8;

    private Lutador desafiante, desafiado;
    private Integer rounds;
    private Boolean aprovada;
    

    public Luta() {
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    private void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiante, Lutador desafiado) {

        if (desafiante.getCategoria().equals(desafiado.getCategoria())
                && !desafiante.equals(desafiado)) {

            Random r = new Random();
            int rounds = r.nextInt(MINIMO_ROUNDS, MAXIMO_ROUNDS + 1);

            this.setAprovada(true);
            this.desafiante = desafiante;
            this.desafiado = desafiado;
            this.rounds = rounds;

            System.out.println("Luta marcada na categoria: " + desafiado.getCategoria()
                                + "\nDesafiante: " + this.desafiante.getNome()
                                + "\nDesafiado: " + this.desafiado.getNome()
                                + "\nTotal de rounds: " + this.rounds
                                + "\n---------------------------------");
        } else {
            this.setAprovada(false);
            System.out.println("Não foi possível marcar a luta!");
        }
    }

    public void lutar() {
        if (this.aprovada) {
            Random r = new Random();
            int resultado = r.nextInt(3);

            System.out.println("E o desafiante: ");
            desafiante.apresentar();

            System.out.println("Agora o desafiado:");
            desafiado.apresentar();


            desafiante.status();
            desafiado.status();

            System.out.println("---------------------------------\nLutando");

            for (int i = 1; i <= this.rounds; i++) {
                if(this.rounds == i) {
                    System.out.println("ÚLTIMO ROUND");
                    System.out.println("...\n---------------------------------");
                } else {
                    System.out.println("ROUND " + i);
                    System.out.println("...");
                }
            }

            switch (resultado) {
                case 0:
                    System.out.println("Luta empatada!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Parabéns ao " + desafiante.getNome() + " ganhou!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("Parabéns ao " + desafiado.getNome() + " ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }

            System.out.println("Fim da luta! Veja as estatísticas atualizadas: \n");
            this.desafiante.status();
            this.desafiado.status();
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
}
