package exemplos.ExemplosPoo;

public class Caneta {

    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampa;

    void rabiscar(){
        if (tampa){
            System.out.println("Rabisco");
        }else{
            System.out.println("Retire a tampa");
        }

    }
    
    void tampar(){
        tampa = true;
    }
    
}
