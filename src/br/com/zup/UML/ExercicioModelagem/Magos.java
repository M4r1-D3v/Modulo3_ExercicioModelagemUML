package br.com.zup.UML.ExercicioModelagem;

public class Magos extends Heroi {

    private double poderMagico;

    public Magos(String nome, double vida, double poderMagico){
        super(nome,vida);
        this.poderMagico = poderMagico;
    }
        public double getPoderMagico(){
        return poderMagico;
        }

        public double setPoderMagico(){
            this.poderMagico = poderMagico;
        }

}

