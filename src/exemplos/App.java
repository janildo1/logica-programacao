package exemplos;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ferramenta que vai permitir utilizar a função de leitura.
        Scanner ler =  new Scanner(System.in);
        
        System.out.println("Exemplo IO");
        //1. Escrever a mensagem "Digite um número." 
        System.out.println("Digite um número: ");
        //2. Ler o número e salvar na variável n1.
        int n1 = ler.nextInt();
        //3. Escrever a mensagem "Digite outro número."
        System.out.println("Digite outro número");
        //4.  Ler o número e salvar na variável n2.
        int n2 = ler.nextInt();
        //5. Fazer a operação Soma e salvar na variável r
        int r = n1 + n2;
        //5. Escrever o Resultado.
        System.out.println("O resultado da soma = "+r);
        ler.close();
    }
}
