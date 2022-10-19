package atividade02;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
    /*1. Escreva um programa que leia um número e 
    escreva na tela se o número é menor, igual ou maior que zero */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        // escreva na tela se o número é menor, igual ou maior que zero
        if (numero < 0){
            System.out.println("Número digitado: "+numero+" -> menor zero.");            
        }else if (numero == 0){
            System.out.println("Número digitado: "+numero+" -> igual a zero.");                    
        }else {
            System.out.println("Número digitado: "+numero+" -> maior que zero.");
        }
        ler.close();        
    }        
}
