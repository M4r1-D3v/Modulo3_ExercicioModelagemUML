package br.com.zup.AulaEncapsulamento.Lista.Ex2;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasNoElevador;
    //private int acrescentarPessoa = 0;
    //private int removerPessoa = 0;


    public int getAndar() {
        return andarAtual;
    }

    public int getTodosAndares(){
        return totalAndares;
    }

    public int getLimiteElevador(){
    return capacidadeElevador;
}
    public int getTotalPessoas() {
    return pessoasNoElevador;
    }

    public void setAndar( int andarAtual){
        this.andarAtual = andarAtual;
    }
    public void setTodosAndares(int totalAndares) {
        this.totalAndares = totalAndares;

    }
    public void setLimiteElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public void setTotalPessoas(int pessoasNoElevador){
        this.pessoasNoElevador = pessoasNoElevador;
    }

    public void entra(int acrescentarPessoa) {
        if (acrescentarPessoa + pessoasNoElevador <= capacidadeElevador) {
            pessoasNoElevador += 1;
        } else {
            System.out.println("\n");
            System.out.println("Elevador lotado, por favor, aguarde o próximo.");
        }
    }
    public void sai(int removerPessoa){
        int saldoPessoas = pessoasNoElevador - removerPessoa;
        if (saldoPessoas < 0){
            System.out.println("Não é possível remover mais pessoas do que o total de pessoas presentes");
        }else{
            pessoasNoElevador = saldoPessoas;
        }
    }
}