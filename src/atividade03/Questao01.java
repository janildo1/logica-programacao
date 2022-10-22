package atividade03;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        /*1. Escreva um programa que vai ler um número, o sistema vai escrever
        na tela a tabuada de 1 até 10 do número digitado. */
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println("Exibindo a tabuada de 1 até 10: " + numero + " x " + i + " = " + numero*i);
        }
    }
    
}
