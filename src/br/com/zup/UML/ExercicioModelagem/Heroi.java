package br.com.zup.UML.ExercicioModelagem;

public class Heroi {
    private String nome;
    private double vida;


    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void trocarNome(String nome){
        setNome(nome);
    }
    public void receberDano(double dano){
        double perderVida = getVida() - dano;
        setVida(perderVida);
    }
    public double exibirVida(){
        return  getVida();
    }
}
