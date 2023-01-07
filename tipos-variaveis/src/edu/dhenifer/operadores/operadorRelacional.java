package edu.dhenifer.operadores;

public class operadorRelacional {
    public static void main(String[] args){
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual a numero2? "+ simNao);

        if(numero1 < numero2){
            System.out.println("Condição verdadeira!");
        }

        String resposta1 = numero1 > numero2 ? "numero1 é maior que numero2" : "numero1 não é maior que numero2"; 
        System.out.println(resposta1);

        // comparar se dois objetos são iguais
        System.out.println(" \nComparação de objetos:");
        String nome1 = "Maiara";
        String nome2 = "Mayara";
        System.out.println("Maiara = Mayara? " + (nome1 == nome2));

        String nome3 = "Maiara";
        String nome4 = new String("Maiara");
        System.out.println("método1 -> Maiara = Maiara? " + (nome3 == nome4));
        System.out.println("método2 -> Maiara = Maiara? " + nome3.equals(nome4));
    }
}
