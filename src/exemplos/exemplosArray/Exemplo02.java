package exemplos.exemplosArray;

import javax.swing.JOptionPane;

public class Exemplo02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            String temp = JOptionPane.showInputDialog("Digite um número: ");
            numeros[i] = Integer.parseInt(temp);

        }
        String numerosDigitados = "";;
        for (int i : numeros){
            numerosDigitados += ","+i;
        }
        JOptionPane.showMessageDialog(null, numerosDigitados);
    }
    
}
