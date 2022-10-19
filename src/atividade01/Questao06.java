package atividade01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        /*6. Escreva um programa para ler o valor de uma conta e quantas pessoas vão dividir a conta,
        o sistema vai apresentar quanto cada pessoa vai pagar.*/

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor total da conta: ");
        float valorTotal = ler.nextFloat();

        System.out.println("Informe a quantidade de pessoas: ");
        int qtPessoas = ler.nextInt();
        //ler.close();

        float valorUnitario = (valorTotal / qtPessoas);
        System.out.println("O valor que cada pessoa vai pagar é R$ "+valorUnitario);
        
    }
    
}
