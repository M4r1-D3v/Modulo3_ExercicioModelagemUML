package br.com.zup.AuladeMetodos.ListaExercicio3;
/*3. Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
quantas pessoas estão presentes nele. A classe deve também disponibilizar os
seguintes métodos:

- Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
- Sobe : para subir um andar (não deve subir se já estiver no último andar);
- Desce : para descer um andar (não deve descer se já estiver no térreo);*/

public class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidadeElevador;
    int pessoasNoElevador;
    int acrescentarPessoa = 0;
    int removerPessoa = 0;


    public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int pessoasNoElevador) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
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



