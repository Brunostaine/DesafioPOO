package interfaces;

import interfaces.InterfaceIphone;

public interface NavegadorInternet extends InterfaceIphone {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
