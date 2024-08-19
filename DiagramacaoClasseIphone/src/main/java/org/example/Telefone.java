package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter@Getter
@RequiredArgsConstructor
public class Telefone implements FuncoesTelefone{

    private String nome;
    private String numero;

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendento o telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
