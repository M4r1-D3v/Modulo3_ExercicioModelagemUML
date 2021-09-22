package br.com.zup.AulaEncapsulamento.Lista.Ex1;

/* */

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc2 = new ContaBancaria();
        cc2.setNome("Mariana");
        cc2.setNumeroDaConta("55555-5");

        cc2.extrato();
        cc2.deposito(500);
        cc2.extrato();

        //para printar só o saldo:
       // System.out.println(cc2.getSaldo());


    }
}
