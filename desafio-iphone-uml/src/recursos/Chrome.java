package recursos;

import funcionalidades.NavegadorInternet;

public class Chrome implements NavegadorInternet{

    public void exibirPagina() {
        System.out.println("Uma página está em exibição no Chrome.");
    }

    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada no Chrome.");
    }

    public void atualizarPagina() {
        System.out.println("Uma página do Chrome foi atualizada.");
    }
    
}
