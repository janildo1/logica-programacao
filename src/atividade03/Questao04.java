package atividade03;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        /*4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022"
        o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa
        pode fazer no máximo 5 tentativas de acertar a palavra. */
        Scanner ler = new Scanner(System.in);
        System.out.println("Você pode fazer no máximo 5 tentativas para tentar acertar a palavra");
        int tentativas = 5;
        
        do{
           System.out.println("Qual seu palpite? ");
           String palpite = ler.nextLine();

           tentativas = tentativas - 1;
            
            if(palpite.contentEquals("Java-2022")){
                System.out.println("Palavra Correta.");
                break;
            
            } else{
                System.out.println("Palavra Errada. Você possui " + tentativas + " tentativas restantes.");
            } 
            //System.out.println("Numero muito grande!" + tentativas + " tentativas restantes.");
                   
        } while (tentativas >0); 
        ler.close();
    }        
}  