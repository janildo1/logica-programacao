package atividade02;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
    /*3. Escreva um programa que solicita a idade 
    de uma pessoa e verifica se ela pode votar (idade>=16).*/
    
            Scanner ler = new Scanner(System.in);
    
            System.out.println("Digite sua idade: ");
            int idade = ler.nextInt();
    
            // verifica se ela pode votar (idade>=16)
            if (idade >= 16){
                System.out.println("Sua idade é: "+idade+" anos. -> Já pode votar.");      
               
            }else {
                System.out.println("Número digitado: "+idade+" anos. -> Ainda não pode votar.");
            }
            ler.close();        
        }     
}
