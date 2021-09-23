package br.com.zup.UML.ExercicioModelagem;

public class Inimigos {
    public String nome;
    public double vida;

    public Inimigos(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
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
