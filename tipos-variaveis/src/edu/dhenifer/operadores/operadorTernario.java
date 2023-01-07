package edu.dhenifer.operadores;

public class operadorTernario {
    public static void main(String [] args) {
        // Operador ternário
        // O operador ternário é representado pelos símbolos ?: na seguinte sintaxe:
        // <Expressão condicional> ? <Caso condição == true> : <Caso condição == false>

        int a, b;
        a = 5;
        b = 6;

        // exemplo "tradicional"
        String resultado1 = "";   
        if(a==b){
            resultado1 = "Verdadeiro";
        } else {
            resultado1 = "Falso";
        }
        System.out.println(resultado1);

        // exemplo operador ternário 
        String resultado = a==b ?"Verdadeiro" : "Falso";
        System.out.println(resultado);
    }

}
