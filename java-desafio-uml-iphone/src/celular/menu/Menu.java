package celular.menu;

import celular.menu.internet.NavegadorInternet;
import celular.menu.musica.ReprodutorMusical;
import celular.menu.telefone.AparelhoTelefonico;

public class Menu implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar(){
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina: " + url);
    }

    @Override
    public void adionarNovaAba() {
        System.out.println("Adicionando nova Aba no Navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
        for(int i = 0; i < 3 ; i ++){
            System.out.println("Tocando . . .");
        }
    }

    @Override
    public void atender() {
        System.out.println("Atendendo . . .\n Alô ???");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
        System.out.println("Voce tem 0 mensagens no seu correio de voz.");
    }
}
