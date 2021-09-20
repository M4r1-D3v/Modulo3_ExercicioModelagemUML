package br.com.zup.ExemploContato;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Contato obj_contato = new Contato();
        Contato gis = new Contato();

        //System.out.println("Atributo sem preenchimento");
        //System.out.println(obj_contato.nome);//aparece null (indefinido)

       // obj_contato.nome = ""; //mudar o nome do objeto
        //obj_contato.nome = "André";
        //System.out.println("Atributo com preenchimento:");
        //System.out.println(obj_contato.nome);//printar nome do objeto

       /* obj_contato.nome = "André Luiz";
        obj_contato.email = "andre@andre";
        obj_contato.idade = 55;
        obj_contato.telefone = "34 9999999";

        System.out.println(obj_contato.nome);
        System.out.println(obj_contato.email);
        System.out.println(obj_contato.idade);
        System.out.println(obj_contato.telefone);

        gis.nome = "Gislaine";
        gis.email = "gis@gis";
        gis.idade = 950;
        gis.telefone = "999999999999";

        System.out.println(gis.nome);
        System.out.println(gis.email);
        System.out.println(gis.idade);
        System.out.println(gis.telefone);
        */ //Aqui serão impressas as informações dos dois objetos criados, pois apesar de serem da mesma classe, são elementos diferentes;


    }
}
