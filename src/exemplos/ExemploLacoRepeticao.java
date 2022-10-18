package exemplos;

public class ExemploLacoRepeticao {

    public static void main(String[] args) {
        int contar = 1; //i
        while(contar <= 10){
            System.out.println(contar);
            System.out.println(" < dentro do loop while");
            //  contar = contar + 1;
            contar++;// equivalente> contar = contar + 1;
        }
        do{
            contar--;// equivalente> contar = contar - 1;
            System.out.println(contar);
            System.out.println(" < dentro do d0-while");
        }while(contar > 1);
        // 1-star da variável; 2-condicação; formar de incremento
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            System.out.println(" < dentro de loop for");
        }


    }
    
}
