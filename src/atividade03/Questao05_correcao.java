package atividade03;

import java.util.Scanner;

public class Questao05_correcao {
    
    public static void main(String[] args) {
    /*5. Escreva um programa que vai ler a idade de 5 pessoas,
    o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor. */ 
    
    Scanner ler = new Scanner(System.in);
    int qtMaior = 0;
    int qtMenor = 0;
    for (int i = 1; i <=5; i++){
        System.out.println("Digite a idade: ");
        int idade = ler.nextInt();

        if(idade >= 18){
            qtMaior++;
        
        }else{
            qtMenor++;
        }
    }
    // Quantidade de pessoas com idade maior ou igual a 18 anos
    System.out.println("Quantidade de pessoas com idade igual ou superior a 18 anos: " + qtMaior + "\n");

    // Quantidade de pessoas com idade inferior a 18 anos
    System.out.println("Quantidade de pessoas com idade inferior a 18 anos: " + qtMenor + "\n");     
    

    }
}
