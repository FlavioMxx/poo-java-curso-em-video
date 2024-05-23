import animal.*;

import javax.security.auth.callback.CallbackHandler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //    Animal animal = new Animal();

        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        PeixeDourado peixeDourado = new PeixeDourado();
        Tartaruga tartaruga = new Tartaruga();

       /* mamifero.setPeso(35.3);
        mamifero.setCorPelo("Marrom");
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.emitirSom();*/

       /* ave.locomover();
        peixe.locomover();
        reptil.locomover();
        */

        canguru.locomover();
        cachorro.locomover();

        cachorro.emitirSom();
        canguru.emitirSom();
    }
}