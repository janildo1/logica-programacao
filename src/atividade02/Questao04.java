package atividade02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
    /*4. Escreva um programa que solicita a idade de uma pessoa e 
    verifica se ela pode dirigir (idade>=18).*/
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        // verifica se ela pode dirigir (idade>=18).
        if (idade >= 18){
            System.out.println("Sua idade é: "+idade+" anos. -> Já pode dirigir.");      
                   
        }else {
            System.out.println("Número digitado: "+idade+" anos. -> Ainda não pode dirigir.");
        }
        ler.close();     
                
    }  
    
}
