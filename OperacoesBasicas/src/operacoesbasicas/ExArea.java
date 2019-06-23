/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesbasicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ExArea extends Operacao {
    
     public double calcularAreaRetangulo() {

         String dado;
         int valorInserido;
         
         dado = JOptionPane.showInputDialog("Insira um palpite");
         valorInserido = Integer.parseInt(dado);
         
         
         
         if (super.calcularAreaRetangulo() == valorInserido ) {
             JOptionPane.showMessageDialog(null, "Parabéns, você acertou o palpite!"+"\nO valor escolhido pelo computador era: "+super.calcularAreaRetangulo());
             
             
         } else if (super.calcularAreaRetangulo() != valorInserido) {
                JOptionPane.showMessageDialog(null, "Parabéns, você errou o palpite!"+"\nO a area do retangulo escolhido pelo computador era: "+super.calcularAreaRetangulo()); 
         }
       
         
     
            return resultado; 

    }
    
    
    
}
