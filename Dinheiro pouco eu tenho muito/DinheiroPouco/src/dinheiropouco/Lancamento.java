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
public class Lancamento {
 
    
    
    protected int saldo; 
    
    

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
  

  
    
    public void adicionarValorSaldo(){
        
    }
    
     public int removerValorSaldo(){
   
       return saldo;
    }
    
    
    public boolean efetuarTransacao(boolean efetuarTransacao){
     

        if(efetuarTransacao == true){
            
             return true;
        } else {
         return false;   
        }
        
        
     
        
    }
    
}
