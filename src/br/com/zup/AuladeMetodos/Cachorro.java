package br.com.zup.AuladeMetodos;


public class Cachorro {
    String raça;
    String porte;
    double tamanho;
    double peso;

    public Cachorro (String raça, String porte, double tamanho, double peso) {
        this.raça = raça;
        this.porte = porte;
        this.tamanho = tamanho;
        this.peso = peso;
    }

        public void mostrarDados(){
            System.out.println("A raça é: " + raça);
            System.out.println("O porte é: " + porte);
            System.out.println("O tamanho é: " + tamanho);
            System.out.println("O peso é: " + peso);
        }

    }

