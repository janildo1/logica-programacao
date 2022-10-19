package atividade02;

import java.util.Scanner;

public class Questao05 {
    
    public static void main(String[] args) {
    /*5. Escreva um programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: 
    “Não pode nem votar e nem dirigir”, “Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.*/
            
    Scanner ler = new Scanner(System.in);
            
    System.out.println("Digite sua idade: ");
    int idade = ler.nextInt();
            
    // verifica se ela pode dirigir (idade>=18).
    if (idade < 16){
        System.out.println("Sua idade é: "+idade+" anos. -> Não pode votar e nem dirigir.");      
                       
    }else if (idade >= 16 && idade < 18){
        System.out.println("Número digitado: "+idade+" anos. -> Pode votar, mas não pode dirigir.");
    }else {
        System.out.println("Número digitado: "+idade+" anos. -> Pode votar e pode dirigir.");
    }
    ler.close();  
                    
    }         

}
