package dispositivos;

import funcionalidades.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

    public void tocarMusica() {
        System.out.println("Reprodutor musical do iPod iniciou uma música.");
    }

    public void pausarMusica() {
        System.out.println("Reprodutor musical do iPod pausou a música.");
    }

    public void selecionarMusica() {
        System.out.println("Uma música foi selecionada no reprodutor musical do iPod.");
    }
    
}
