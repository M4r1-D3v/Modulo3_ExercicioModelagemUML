package br.com.zup.AuladeMetodos.Exemplo1.ListaExerccio1;

/*
Crie uma classe que represente um carro, que tenha como características o
nome, o peso, a fabricante, a cor e o valor do carro. Crie também o método
darDesconto() que servirá para diminuir o preço do carro e o método pintar(), que
será responsável por mudar a cor do carro. Crie um carro no seu programa
principal, utilize os métodos criados e mostre na tela o preço e a cor do carro antes
e depois da utilização dos métodos.
*/
public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;
    String novaCor ="";
    double desconto = 0;
    double valorDesconto;
    String escolhaCor = "";


    public Carro(String nome, double peso, String fabricante, String cor, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;


        }
            public void darDesconto (double desconto){
            valorDesconto = valor - desconto;
        }

            public void pintar (String novaCor){
            escolhaCor = novaCor;
        }
        public void mostrarDados () {
            System.out.println("O nome do veículo é: " + nome);
            System.out.println("O peso do veículo é: " + peso + " kg");
            System.out.println("O fabricante do veículo é: " + fabricante);
            System.out.println("A cor original do veículo é: " + cor);
            System.out.println("O valor original do veículo é: " + " R$ " + valor);
            System.out.println("--------------------------");
            System.out.println("O valor do veículo com desconto é: " + "R$" + valorDesconto);
            System.out.println("A nova cor escolhida para o veículo será: " + escolhaCor);
            System.out.println("----------------------");
        }



    }



