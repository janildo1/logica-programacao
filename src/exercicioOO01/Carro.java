package exercicioOO01;

/*
Criar a Classe Carro 
Atributos: marca, modelo e velocidade com encapsulamento private.
Criar a método construtor para informar a Marca e o Modelo;
Criar os Métodos: acelerar, frear, toString, printStatus;
Regras para o método acelerar. 
retorno void
entrada 1 valore int
o valor de entrada vai somar a velocidade atual do carro.
a velocidade máximo do carro é de 200km.
mostrar a mensagem da modificação da velocidade. 
Exemplo: velocidade atual + valor informado > valor atualizado.

Regras para o método frear. 
retorno void
entrada 1 valore int
o valor de entrada vai subtrair a velocidade atual do carro.
o carro não pode ir para velocidade menor que zero.
mostrar a mensagem da modificação da velocidade. 
Exemplo: velocidade atual - valor informado > valor atualizado.

Para os métodos toString e printStatus fazer da mesma forma visto em aula.
 */

//Atributos: marca, modelo e velocidade com encapsulamento private.
public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    // Criar a método construtor para informar a Marca e o Modelo;
    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        velocidade = 0;
    }

    // Criar os Métodos: acelerar, frear, toString, printStatus;
    public void acelerar (int a) {
        System.out.println("Acelerando o "+modelo+".");
        velocidade = velocidade + a;
        if (velocidade > 200) {
            System.out.println("A Velocidade máxima do carro é de 200km/h.");
            velocidade = 200;
        } else {
            System.out.println("A velocidade atual do carro é: " + velocidade + " km/h");
        }
    }

    void frear (int f) {
        System.out.println("Freando o "+modelo+".");
        velocidade = velocidade - f;
        if (velocidade < 0) {
            System.out.println("O carro não pode ir para velocidade menor que zero.");
            velocidade = 0;
        } else {
            System.out.println("A velocidade atual do carro é: " + velocidade + " km/h.");
        }
    }

    public String toString() {
        return "Carro {" + "marca='" + marca + '\'' + ", modelo='" 
        + modelo + '\'' + ", velocidade=" + velocidade + '}';
    }

    public void printStatus() {
        System.out.println(toString());
    }

}
