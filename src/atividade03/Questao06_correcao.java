package atividade03;

import java.util.Scanner;

public class Questao06_correcao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = 0;
        int menor = 1000;
        int soma= 0;
        for (int i = 1; i <=5; i++){
            System.out.println("Digite um número: ");
            int num = ler.nextInt();
    
            if(num > maior){
                maior = num;
            
            }if (num < menor){
                menor = num;
            }
            soma = soma + num;
        }
        System.out.println("Maior = " + maior + "\n");    
        System.out.println("Menor =  " + menor + "\n");
        System.out.println("Soma = " + soma + "\n");    
        System.out.println("Média =  " + (soma / 5) + "\n"); 
        System.out.println("Resto =  " + (soma % 5) + "\n");
        float media = soma / 5f;
        System.out.println("Média fracionada = " + media);         
        
    
    }
    
}
