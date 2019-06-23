/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

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
       
        Carro carro1 = null;
        
       
        
       String dado = JOptionPane.showInputDialog("Insira o tipo do carro:"
               + "\n1. Sedan"
               + "\n2. SUV"
               + "\n3. Hatch");
        
       
       int op = Integer.parseInt(dado);
       
       switch (op){
           
           case 1:
               carro1 = new Sedan("BMW",1996);
               JOptionPane.showMessageDialog(null, carro1.getNome());
               break;
               
               
           case 2:
               carro1 = new SUV("SeiláqueCarroEsse",2018);
               JOptionPane.showMessageDialog(null, carro1.getNome());
          
               
               break;
               
               
           case 3:
               
                carro1 = new Hatch("Esse eu sei menos ainda",2069);
               JOptionPane.showMessageDialog(null, carro1.getNome());
               
               break;
               
               
               
       }
       
       
       
       
       
       
    }
    
}
