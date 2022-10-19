package atividade02;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
    /*2. Escreva um programa que receba três inteiros e 
    diga qual deles é o maior e qual o menor.*/

    Scanner ler = new Scanner(System.in);

    int num = 0, maior = 0, menor = 0;

	for(int x = 0; x < 3; x++){
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if(x == 0){
			
			maior = num;
			menor = num;
		}
		
		if(num > maior){
			
			maior = num;
		}
		
		if(num < menor){
			
			menor = num;
		}
	}
	
	System.out.print("Maior: "+ maior +". Menor: "+ menor);
    }

}