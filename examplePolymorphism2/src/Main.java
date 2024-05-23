import animal.Cachorro;
import animal.Lobo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11, 45);
        cachorro.reagir(21, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5);
        cachorro.reagir(17, 4.5);
    }
}