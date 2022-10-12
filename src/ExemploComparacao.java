public class ExemploComparacao {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        //Operações de comparação
        System.out.println(x == y);//false
        System.out.println(x != y);//true
        System.out.println(x > y);//true
        System.out.println(x < y);//false
        System.out.println(x >= y);//true
        System.out.println(x <= y);//false
        System.out.println("== Operações lógicas==");
        boolean a = true;
        System.out.println(a && true && 3 < 8);

        boolean vaiTerAula;//
        boolean diaSemana = true;
        boolean feriado = true;
        vaiTerAula = diaSemana && !feriado;
        System.out.println(vaiTerAula);
        System.out.println(diaSemana == true && feriado == false);


    }
    
}
