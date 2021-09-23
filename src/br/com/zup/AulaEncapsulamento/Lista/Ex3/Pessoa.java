package br.com.zup.AulaEncapsulamento.Lista.Ex3;

/*3. Crie uma classe para representar uma pessoa, com os atributos privados de
nome, data de nascimento e altura. Crie os métodos públicos necessários para sets
e gets e também um método para imprimir todos dados de uma pessoa. Crie um
método para calcular a idade da pessoa.*/

import javax.xml.crypto.Data;

public class Pessoa {
    private String nome;
    private Data dataNascimento;
    private double altura;

    public String getNome(){
        return nome;
    }

    public Data getDataNascimento(){
        return dataNascimento;
    }

    public double getAltura(){
        return altura;

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDataNascimento (Data dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
/*
    public void calculoIdade();*/

}
