package br.com.zup.AulaEncapsulamento;

import br.com.zup.AulaEncapsulamento.Lista.Televisao;

public class ControleRemoto {
    Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume(){
        int novoVolume = tv.getVolume() + 1;
        tv.setVolume(novoVolume);
    }

    public void diminuirVolume(){
        int volumeDiminuido = tv.getVolume() - 1;
        tv.setVolume(volumeDiminuido);
    }
    public void aumentarCanal(){
        int canalAumentado = tv.getCanal() + 1;
        tv.setCanal(canalAumentado);
    }

    public void diminuirCanal(){
        int canalDiminuido = tv.getCanal() - 1;
        tv.setCanal(canalDiminuido);
    }

    public void trocarCanal(int novoCanal){

        tv.setCanal(novoCanal);
    }

    public void mostrarDados(){
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
    }
/*     - outra solução pra exibir os dados:
    public  String retornarDados(){
        return "Canal: " + tv.getCanal() +
                "Volume: " + tv.getVolume();
    }*/
}
