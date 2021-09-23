package br.com.zup.AulaEncapsulamento.Lista.Ex3;

import br.com.zup.AulaEncapsulamento.ControleRemoto;
import br.com.zup.AulaEncapsulamento.Lista.Televisao;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao(5,9);
        ControleRemoto controle = new ControleRemoto(tv);

        controle.mostrarDados();
        controle.aumentarVolume();
        controle.mostrarDados();


    }
}
