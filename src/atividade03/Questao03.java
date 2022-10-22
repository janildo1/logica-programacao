package atividade03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        /*3. Escreva um programa que vai ler 2 números, o sistema vai escrever
        na tela todos os números entre os 2 digitados. */
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = ler.nextInt();

        if(num1 < num2){
            for (int i = num1 + 1; i > num1 && i < num2; i++){        
                System.out.println(i);
            }

        }else if (num2 < num1){
            for (int i = num2 + 1; i > num2 && i < num1; i++){        
                System.out.println(i);
            }           
        }else {
            System.out.println("Os números digitados são iguais.");
        }
        
    }
    
}
