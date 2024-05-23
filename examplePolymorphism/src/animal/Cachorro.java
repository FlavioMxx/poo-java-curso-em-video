package animal;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }

    public void enterrarOsso() {
        System.out.println("Osso enterrado");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }
}
