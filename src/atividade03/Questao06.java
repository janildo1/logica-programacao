package atividade03;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        /*6. Escreva um programa que vai ler 5 números o sistema vai mostrar
         o maior o menor a soma e a média dos números digitados. */

         Scanner ler = new Scanner(System.in);

         int numero, totalSoma, maior = 0, menor = 1000, media = 0, soma = 0;
         int contMaior = 0, contMenor = 0, i;
         
         for(i = 0; i < 5; i++){
             System.out.println("Digite um número entre 0 e 1000: ");
             numero = ler.nextInt();
             
             // Validar o intervalo entre 0 e 1000
             if( (numero < 1) || (numero > 1000) ){
                 i = i - 1;
             } else{
                 // Guardar os número digitados
                 soma = soma + numero;
 
                 // Guardar o maior número
                 if(numero > maior){
                     maior = numero;
                     contMaior++;
                 }
 
                 // Guardar o menor número
                 if(numero < menor){
                     menor = numero;
                     contMenor++;
                 }   
             
             } // final validação
         } 
         //Imprimindo o maior, o menor, a soma e a média dos números digitados.
         System.out.println("O maior número digitado foi: " + maior);
         System.out.println("O menor número digitado foi: " + menor);
         System.out.println("A soma dos números digitados foi: " + soma);
         System.out.println("A média dos números digitados foi: " + (media = soma / i));

    }
    
}
