package atividade03;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        /*5. Escreva um programa que vai ler a idade de 5 pessoas,
        o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor. */
        
        Scanner ler = new Scanner(System.in);

        int idade, cont = 0, maior = 0, menor = 0;
        
        // Lendo a idade de 5 pessoas
        do{
            System.out.println("Digite uma idade: ");
            idade = ler.nextInt();

            // Idade maior ou igual a 18 anos
            if(idade >= 18){
                maior++; // contar a quantidade de pessoas
            }
            
            // Idade menor que 18 anos
            if(idade < 18){
                menor++;// contar a quantidade de pessoas
            }

            cont++;
            System.out.println("\n");
        }while(cont < 5);

        // Quantidade de pessoas com idade maior ou igual a 18 anos
        System.out.println("Quantidade de pessoas com idade igual ou superior a 18 anos: " + maior + "\n");

        // Quantidade de pessoas com idade inferior a 18 anos
        System.out.println("Quantidade de pessoas com idade inferior a 18 anos: " + menor + "\n");     

    }
    
}
