package desafioIphone;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical rp = new ReprodutorMusical();
        AparelhoTelefonico ap = new AparelhoTelefonico();
        Navegador nv = new Navegador();

        rp.selecionarMusica();
        ap.ligar();
        nv.exibirPagina();
    }
}
