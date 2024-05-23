import pessoa.Gafanhoto;
import pessoa.visualizacao.Visualizacao;
import video.Video;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula JAVA BÁSICO");
        v[1] = new Video("Aula POO JAVA");
        v[2] = new Video("Aula JAVA Spring");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Flavio","H", 23, "flaviom");
        g[1] = new Gafanhoto("Jullya", "M", 21, "jullyac");

        Visualizacao[] vv = new Visualizacao[2];

        vv[0] = new Visualizacao(g[0], v[1]);
        vv[0].avaliar();
        System.out.println(vv[0].toString());

        vv[1] = new Visualizacao(g[0], v[2]);
        vv[0].avaliar(85.0);
        System.out.println(vv[1].toString());
        System.out.println(vv[0].toString());

       /* System.out.println(v[1].toString());
        System.out.println(g[0].toString());*/



    }
}