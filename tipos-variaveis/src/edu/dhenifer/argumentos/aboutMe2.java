package edu.dhenifer.argumentos;

import java.util.Scanner;

public class aboutMe2 {
    public static void  main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite deu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // imprimi os Dados 
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
        
    } 
    
}
