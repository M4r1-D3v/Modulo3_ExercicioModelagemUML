package br.com.zup.AulaEncapsulamento.Lista.Ex1;

/*
#1. Modifique os acessos dos atributos da classe
referente à Conta Bancária da aula anterior para private e execute o seu programa principal sem alterá-lo.
*/

    public class ContaBancaria {
    private String numeroDaConta; //Foram criados três atributos privados na classe.
    private double saldo = 0; //Deixa o saldo sendo zero por default pq se não for feito nenhum depósito, o saldo vai ser 0.
    private String nomeDoCorrentista;//Somente os membros (métodos/atributos) desta classe tem acesso a esses atributos privados.

    /*Como fazer para que outras classes consigam acessar esses atributos privados?
     -> através dos métodos públicos *getters e setters*
*/
    //Para criar o método get, que "pega" o atributo privado, temos a seguinte sintaxe:
    public String getNome(){
        return nomeDoCorrentista;
    }

    public String getNumero(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }
    //SEMPRE que tivermos atributos privados, precisaremos criar os getters e setters deles.
    /*Não faz diferença se o atributo é privado, aliás, isso não significa que ele é inacessível per se,
    mas que ele deve ser acessado pelos métodos públicos getter e setter, ou seja, é privado para acesso e modificação DIRETA.
      */
    public void setNome(String nomeDoCorrentista){
        this.nomeDoCorrentista = nomeDoCorrentista; //O atributo da classe passa a ser o nome recebido no parâmetro.
    }

    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo){ //não faz sentido ter esse código pq agora com os dados encapsulados, consegue-se alterar o saldo via depósito, fica redundante.
        this.saldo = saldo;
    }
/* Há um padrão Java Bean que determina que ao CRIAR UMA CLASSE:
1) Colocar os atributos da classe;
2) Método Construtor;
3) Getters/Setters;
4) Outros métodos.
 */
    public void saque(double valorSacado) {
        saldo = saldo - valorSacado;
    }
    public void deposito(double quantiaDepositada) {
        saldo = saldo + quantiaDepositada;
    }

    public void extrato() {
        System.out.println("------------------------");
        System.out.println("Nome do correntista: " + nomeDoCorrentista);
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Saldo em conta R$: " + (saldo));
        System.out.println("------------------------");

    }

    // #Pq não há o método construtor? --> Na verdade há sim um método construtor, pois quando este não é especificado, o Java coloca por padrão, um método construtor sem parâmetros.
    // Assim, os métodos getter/setter NÃO substituem o método construtor.

    /*
    Agora se precisar colocar um método construtor, de forma a fazer com que o objeto construído possua obrigatoriamente determinados atraibutos,
     nesse caso, queremos fazer com que um objeto não seja criado sem nome e numero da conta, ficaria assim:

    A classe:

     public class ContaBancaria {
    private String numeroDaConta;
    private double saldo = 0;
    private String nomeDoCorrentista;

    O método construtor criado:

    public ContaBancária(String numeroDaConta, double saldo, String nomeDoCorrentista){
            this.numeroDaConta = numeroDaConta;
            this.nomeDoCorrentista = nomeDoCorrentista;
            }

    */
}

