package br.com.zup.AulaEncapsulamento.Lista.Ex2;

public class Main {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador();

        elevador1.setAndar(5);
        System.out.println(elevador1.getAndar());
        elevador1.setLimiteElevador(8);
        System.out.println(elevador1.getLimiteElevador());
    }
}
