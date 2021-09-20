package br.com.zup.ListaExercicioModelagemClasses;

public class ContaCorrente {
    int numeroDaConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(int numeroDaConta, String nomeCorrentista, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }
}
