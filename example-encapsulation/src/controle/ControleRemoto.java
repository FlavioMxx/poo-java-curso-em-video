package controle;


public class ControleRemoto implements Controlador{

    private Integer volume;
    private Boolean ligado;
    private Boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getTocando() {
        return tocando;
    }

    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if(this.getLigado()) {
            return;
        }
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        if(this.getLigado()) {
            this.setLigado(false);
        }

    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + this.getLigado());
        System.out.print("Volume: " + this.getVolume() + " ");

        for(int i = 5; i <= this.getVolume(); i += 5) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu!");
    }

    @Override
    public void maisVolume() {
        if(this.getVolume() < 100) {
            this.setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getVolume() > 0) {
            this.setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getTocando()) {
            return;
        }
        this.setTocando(true);
    }

    @Override
    public void pause() {
            if (this.getTocando()) {
                this.setTocando(false);
            }
    }
}
