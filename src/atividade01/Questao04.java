package atividade01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        /*4. Escreva um programa para ler o nome, valor da hora, quantas horas trabalhadas,
        o sistema vai apresentar o salário.
        <fulano> vai receber R$<00.00> */
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = ler.nextLine();

        System.out.println("Informe o valor da hora: ");
        float valorHora = ler.nextFloat();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        float qtHoras = ler.nextFloat();

        float salario = (valorHora * qtHoras);
        System.out.println(nome+" vai receber R$ "+salario);

        ler.close();      
        
    }
    
}
