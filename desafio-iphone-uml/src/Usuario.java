
import dispositivos.Iphone;
import dispositivos.Ipod;
import recursos.Chrome;

public class Usuario {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        // -- iPhone
        Iphone iphone = new Iphone();
        System.out.println("-- iPhone --");
        // Funcionalidades do navegador do iPhone
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Funcionalidades do reprodutor musical do iPhone
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        // Funcionalidades do aparelho telefonico no iPhone
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        // -- iPod
        System.out.println("-- iPod --");
        Ipod ipod = new Ipod();

        // Funcionalidades do reprodutor musical do iPod
        ipod.tocarMusica();
        ipod.pausarMusica();
        ipod.selecionarMusica();

        // -- Chrome
        Chrome chrome = new Chrome();
        System.out.println("-- Chrome --");
        // Funcionalidades do navegador de internet do Chrome
        chrome.exibirPagina();
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
    }
}
