package org.example;

public class Navegador implements FuncoesNavegador{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionou nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizou a página");
    }
}
