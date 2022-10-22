package atividade03;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        /*4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022"
        o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa
        pode fazer no máximo 5 tentativas de acertar a palavra. */
        Scanner ler = new Scanner(System.in);
        //System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine();
        int tentativas = 5;
        int palpite = 0;
        boolean acertou = false;
        String palavraCorreta = "Java-2022";
        
        while(tentativas > 0 && acertou == false){
            System.out.println("Qual seu palpite? ");
            palavra = ler.nextLine();
            
            if(palavra == palavraCorreta){
            System.out.println("Palavra Correta.");
            acertou = true;
            } else if(palavra != palavraCorreta){
            --tentativas;
            System.out.println("Palavra Errada" + tentativas + " tentativas restantes.");
            } else{
            --tentativas;
            System.out.println("Numero muito grande!" + tentativas + " tentativas restantes.");
            }
            
        } 
        
    }        
}  