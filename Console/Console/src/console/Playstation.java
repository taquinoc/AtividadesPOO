/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import javax.swing.JOptionPane;

/**
 *
 * @author e6661387
 */
public class Playstation extends Console{
    
    public Playstation(String nome, String modelo, float preco) {
        super(nome, modelo, preco);
    }
    
    
      public void comprarJogo(){
        JOptionPane.showMessageDialog(null, "O console comprado foi: "+this.nome+" no valor de: "+this.preco);
    }
    
}
