package atividade01;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Questao01 {
    public static void main(String[] args) {
        /*1. Escreva um programa para ler 2 notas, o sistema vai apresentar a média final, 
        se nota maior que 7 incluir mensagem "aprovado" senão "reprovado". */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = ler.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = ler.nextFloat();

        float media = (nota1 + nota2)/2;
        System.out.println("A média final do aluno foi: "+media);
        
        if(media >= 7){
            System.out.println("O aluno foi Aprovado.");

        }else{
            System.out.println("O aluno foi Reprovado.");
        }
    }    
}
