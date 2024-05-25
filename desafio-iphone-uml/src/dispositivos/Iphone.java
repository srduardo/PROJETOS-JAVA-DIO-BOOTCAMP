package dispositivos;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void exibirPagina() {
        System.out.println("Página em exibição no navegador do iPhone.");
    }

    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada no navegador do iPhone.");
    }
 
    public void atualizarPagina() {
        System.out.println("A página foi atualizada.");
    }

    public void ligar() {
        System.out.println("iPhone ligando para alguém...");
    }

    public void atender() {
        System.out.println("Uma chamada foi atendida com iPhone.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz do iPhone iniciado.");
    }

    public void tocarMusica() {
        System.out.println("Música iniciada com o reprodutor musical do iPhone.");
    }

    public void pausarMusica() {
        System.out.println("Música pausada no reprodutor musical do iPhone");
    }

    public void selecionarMusica() {
        System.out.println("Uma música foi selecionada no reprodutor musical do iPhone");
    }
    
}
