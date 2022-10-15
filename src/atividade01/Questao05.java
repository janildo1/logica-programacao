package atividade01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        /*5. Escreva um programa para ler o valor de um jantar, o sistema vai apresentar
        a taxa do garçom 10% e também o valor
        <valor refeição> + 10% = <final total>. */

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do jantar: ");
        float valorJantar = ler.nextFloat();
        ler.close();

        float taxaGarcom = (valorJantar * 10)/100;
        System.out.println("A taxa de garçom é R$ "+taxaGarcom);

        System.out.println("O valor da refeição é R$ "+valorJantar);

        float valorTotal = (valorJantar + taxaGarcom);
        System.out.println("O valor total é R$ "+valorTotal);           
        
    }
    
}
