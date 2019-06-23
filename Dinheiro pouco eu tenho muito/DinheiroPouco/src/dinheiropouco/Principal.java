/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinheiropouco;

import javax.swing.JOptionPane;

/**
 *
 * @author e6661387
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Lancamento primeiroLancamento = new Receita();
        
        
        
        primeiroLancamento.adicionarValorSaldo();
        JOptionPane.showMessageDialog(null, "Seu saldo atual é: "+primeiroLancamento.getSaldo()+" agora iremos zerar sua conta");
        primeiroLancamento = new Despesa();
         primeiroLancamento.removerValorSaldo();
        JOptionPane.showMessageDialog(null, "Seu saldo atual agora é: "+primeiroLancamento.getSaldo());
        
       
    }
    
}
