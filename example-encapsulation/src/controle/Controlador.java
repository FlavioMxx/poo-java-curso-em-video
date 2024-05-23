package controle;

public interface Controlador {

    void ligar(); //Não é necessário dizer que é um método abstrato, pois se torna redundante numa interface.
    void desligar(); //Não é necessário dizer que é um método público, pois se torna redundante numa interface.
    void abrirMenu();
    void fecharMenu();
    void maisVolume();
    void menosVolume();
    void ligarMudo();
    void desligarMudo();
    void play();
    void pause();
}
