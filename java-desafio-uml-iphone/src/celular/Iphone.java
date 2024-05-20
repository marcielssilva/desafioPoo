package celular;

import celular.menu.Menu;
import celular.menu.internet.NavegadorInternet;
import celular.menu.musica.ReprodutorMusical;
import celular.menu.telefone.AparelhoTelefonico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Iphone {
    public static void main(String[] args) {
        /* TODAS AS FUNCOES SAO FEITAS APARTIR DA IMPLEMENTACAO DO MENU */
        Menu mn = new Menu();

        mn.adionarNovaAba();
        mn.atualizarPagina();
        mn.exibirPagina("github.com");

        mn.atender();
        mn.iniciarCorreioVoz();
        mn.ligar("15 4002-8922");

        mn.tocar();
        mn.selecionarMusica("Galopeira");
        mn.pausar();

    }
}