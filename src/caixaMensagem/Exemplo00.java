package caixaMensagem;

import javax.swing.JOptionPane;

public class Exemplo00 {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Java com JOptionPane");
        //JOptionPane.showConfirmDialog(null, "titulo");
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
        JOptionPane.showInputDialog("Bem vindo " + nome); 
    }
    
}
