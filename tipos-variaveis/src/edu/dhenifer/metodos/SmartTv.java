package edu.dhenifer.metodos;

public class SmartTv {

    // estado inicial
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("novo status -> TV ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("novo status -> TV desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("novo status -> Volume atual: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("novo status -> Volume atual: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("novo status -> Canal autal: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("novo status -> Canal autal: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("novo status -> Canal autal: " + canal);
    }
}
