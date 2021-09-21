package br.com.zup.AuladeMetodos.ListaExercicio4;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito(2000,500,"Mariana");
        cartao1.aumentaLimite(1000);
        cartao1.realizaCompra(800);
        System.out.println(cartao1.saldo);
        System.out.println(cartao1.limite);
        cartao1.imprimeFatura();
    }
}
