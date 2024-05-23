import livro.Livro;
import pessoa.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {

        Pessoa pessoa[] = new Pessoa[2];
        Livro livro[] = new Livro[2];
        Integer i = 5;

        pessoa[0] = new Pessoa("Flavio", 23, "H");
        pessoa[1] = new Pessoa("Jullya", 21, "M");

        livro[0] = new Livro("Código limpo: habilidades práticas do Agile software", "Robert C. Martin ", 425, pessoa[0]);
        livro[1] = new Livro("Sra. Fletcher", "Tom Perrota", 297, pessoa[1]);

        livro[0].detalhes();

        livro[0].abrir();
        livro[0].folhear(5);
        livro[0].avancarPag();
        livro[0].detalhes();
        livro[0].voltarPag();
        livro[0].fechar();
        livro[0].detalhes();

        livro[1].detalhes();

        livro[1].abrir();
        livro[1].folhear(5);
        livro[1].avancarPag();
        livro[1].detalhes();
        livro[1].voltarPag();
        livro[1].fechar();
        livro[1].detalhes();
    }
}