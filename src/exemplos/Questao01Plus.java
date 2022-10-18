package exemplos;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Questao01Plus {
    public static void main(String[] args) {
        /*1. Escreva um programa para ler 2 notas, o sistema vai apresentar a média final, 
        se nota maior que 7 incluir mensagem "aprovado" senão "reprovado". */

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = ler.nextDouble();
        
        double media = (nota1 + nota2)/2;
        System.out.println("A média final do aluno foi: "+media);

        ler.close();
        // aprovado >=; recuperação >= 4; reprovado < 4, erro digitação > 10 ou < 0
        if (media > 10 || media < 0){
            System.out.println("Erro de digitação.");            
        }else if (media < 4){
            System.out.println("Reprovado");
        }else if (media < 7){
            System.out.println("Recuperação");                
        }else{
            System.out.println("O aluno foi Aprovado.");
        }        
    }    
}

