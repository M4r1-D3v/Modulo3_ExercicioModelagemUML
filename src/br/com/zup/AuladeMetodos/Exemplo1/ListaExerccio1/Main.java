package br.com.zup.AuladeMetodos.Exemplo1.ListaExerccio1;

public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca",400,"Volkswagen","Azul",10000);
        fusca.mostrarDados();
        fusca.darDesconto(1500);
        fusca.pintar("Branca");
        fusca.mostrarDados();




    }
}
