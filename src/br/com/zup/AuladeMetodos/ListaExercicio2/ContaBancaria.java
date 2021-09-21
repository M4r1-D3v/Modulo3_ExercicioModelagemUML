package br.com.zup.AuladeMetodos.Exemplo1.ListaExercicio2;

/*2. Crie uma classe referente à uma conta bancária, que possui como atributos o seu
número, saldo e o nome do correntista. Crie também o método saque() que serve
para retirar o certo valor do saldo, o método depósito() que serve para adicionar um
valor ao saldo e o método extrato() que serve para mostrar na tela o nome do
correntista, o número da conta e o saldo. Crie um programa principal e demonstre a
utilização dos métodos implementados. */

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ContaBancaria {
        String numeroDaConta;
        double saldo;
        String nomeDoCorrentista;



        public ContaBancaria(String numeroDaConta, double saldo, String nomeDoCorrentista) {
            this.numeroDaConta = numeroDaConta;
            this.saldo = saldo;
            this.nomeDoCorrentista = nomeDoCorrentista;
        }

        public void saque(double valorSacado){
            saldo = saldo - valorSacado;
        }

        public void deposito(double quantiaDepositada){
            saldo= saldo + quantiaDepositada;
        }

        public void extrato(){
            System.out.println("------------------------");
            System.out.println("Nome do correntista: " + nomeDoCorrentista);
            System.out.println("Número da conta: " + numeroDaConta);
            System.out.println("Saldo em conta R$: " + (saldo));
            System.out.println("------------------------");
        }
    }