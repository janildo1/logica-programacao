package atividade03;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        /*2. Escreva um programa que vai ler uma mensagem e um número, o sistema vai
        repetir a mensagem digitada x vezes o número digitado. */
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String mensagem = ler.nextLine();
        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        for (int i=0 ; i<=numero; i++){
            System.out.println(mensagem);
        }
    }
    
}
