package atividade01;

import java.util.Scanner;

public class Questao00 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //nome, idade, altura, sexo
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite seu idade: ");
        int idade = ler.nextInt();

        System.out.println("Digite seu altura: ");
        float altura = ler.nextFloat();

        System.out.println("Digite seu sexo: ");
        char sexo = ler.next().toCharArray()[0];

        //ler.close();

        System.out.println("Informações regitradas");
        System.out.println("Nome"+nome);
        System.out.println("Idade"+idade);
        System.out.println("Altura"+altura);
        System.out.println("Sexo"+sexo);

        /* quantas copas do mundo essa pessoa já viu o Brasil vencer?
        Anos que brasil ganhou a copa: 1958 1962 1970 1994 2002 futura 2022*/
        int anoNascimento = 2022 - idade;
        int qtCopas = 0;
        String listaCopas = "";
        if(anoNascimento <= 1958){
            qtCopas++;
            listaCopas += " 1958";
        } 
        if(anoNascimento <= 1962){
            qtCopas++;
            listaCopas += " 1962";
        } 
        if(anoNascimento <= 1970){
            qtCopas++;
            listaCopas += " 1970";
        } 
        if(anoNascimento <= 1994){
            qtCopas++;
            listaCopas += " 1994";
        } 
        if(anoNascimento <= 2002){
            qtCopas++;
            listaCopas += " 2002";
        }
        System.out.println("As copas que eu vi: anos" + listaCopas + "(" + qtCopas + ").");        
    }
    
}
