/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesbasicas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ExContas extends Operacao {
    
    
    
 
    
    public double calcularDivisao() {

        String dado = JOptionPane.showInputDialog("Insira um palpite");
         int valorInserido = Integer.parseInt(dado);
         
         
         
         if (super.calcularDivisao() == valorInserido ) {
             JOptionPane.showMessageDialog(null, "Parabéns, você acertou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularDivisao());
             
             
         } else if (super.calcularDivisao() != valorInserido) {
             JOptionPane.showMessageDialog(null, "Parabéns, você errou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularDivisao()); 
         }
        
        return resultado;
    }

    public double calcularMultiplicacao() {

           String dado = JOptionPane.showInputDialog("Insira um palpite");
         int valorInserido = Integer.parseInt(dado);
         
         
         
         if (super.calcularMultiplicacao() == valorInserido ) {
             JOptionPane.showMessageDialog(null, "Parabéns, você acertou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularMultiplicacao());
             
             
         } else if (super.calcularMultiplicacao() != valorInserido) {
             JOptionPane.showMessageDialog(null, "Parabéns, você errou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularMultiplicacao()); 
         }
        
        return resultado;

    }

    public double calcularSubtracao() {
         String dado = JOptionPane.showInputDialog("Insira um palpite");
         int valorInserido = Integer.parseInt(dado);
         
         
         
         if (super.calcularSubtracao() == valorInserido ) {
             JOptionPane.showMessageDialog(null, "Parabéns, você acertou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularSubtracao());
             
             
         } else if (super.calcularSubtracao() != valorInserido) {
             JOptionPane.showMessageDialog(null, "Parabéns, você errou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularSubtracao()); 
         }
        
        return resultado;
    }

    public double calcularAdicao() {

           String dado = JOptionPane.showInputDialog("Insira um palpite!");
         int valorInserido = Integer.parseInt(dado);
         
         
         
         if (super.calcularAdicao() == valorInserido ) {
             JOptionPane.showMessageDialog(null, "Parabéns, você acertou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularAdicao());
             
             
         } else if (super.calcularAdicao() != valorInserido) {
             JOptionPane.showMessageDialog(null, "Parabéns, você errou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularAdicao()); 
         }
        
        return resultado;
    }

 
}
