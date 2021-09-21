package br.com.zup.AuladeMetodos.ListaExercicio4;
/*4. Crie uma classe que represente um cartão de crédito, que deve ter como
atributos o seu limite, o saldo da fatura e nome do cliente. Crie também os métodos
aumentaLimite(), diminuiLimite(), realizaCompra() que não deve permitir uma
compra caso o limite tenha sido atingido e o imprimeFatura() que imprime na tela o
valor da fatura.*/

public class CartaoCredito {
    double limite;
    double saldo=0;
    String nomeCliente;
    double maisLimite;
    double menosLimite;
    double valorCompras;


    public CartaoCredito(double limite, double saldo, String nomeCliente) {
        this.limite = limite;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }

    public void aumentaLimite(double maisLimite) {
        limite = limite + maisLimite;
    }

    public void diminuiLimite(double menosLimite) {
        limite = limite - menosLimite;
    }

    public void realizaCompra(double valorCompras) {
        if (valorCompras >= limite) {
            System.out.println("Limite excedido.");
        } else {
            limite = limite - valorCompras;
            saldo = saldo + valorCompras;
        }
    }

    public void imprimeFatura() {
        System.out.println("O valor total a ser pago desta fatura é: " + saldo);
    }
}
