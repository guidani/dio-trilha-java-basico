import apps.navegadores.Navegador;
import apps.reprodutoresMusicas.ReprodutorMusical;
import apps.telefones.Telefone;

public class IPhone {
    public static void main(String[] args) throws Exception {
        // Telefone
        Telefone telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();
        // Navegador

        Navegador navegador = new Navegador();
        navegador.abrirNovaAba();
        navegador.exibirPagina();
        navegador.atualizarPagina();

        // Reprodutor de Musica
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
    }
}
