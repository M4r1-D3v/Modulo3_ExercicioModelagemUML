package br.com.zup.AuladeMetodos.Exemplo1.ListaExercicio2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc1 = new ContaBancaria("78994566",3000,"Mariana");
        cc1.extrato();
        cc1.saque(1000);
        cc1.extrato();
        cc1.saque(500);
        cc1.extrato();
        cc1.deposito(400);
        cc1.extrato();

    }
}
