/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circo;

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
       
        Artista artista1 = null;
        
        
        
        
        
       String dado = JOptionPane.showInputDialog("Insira o cargo do artista:"
                + "\n1.Malabarista"
                + "\n2.Equilibrista"
                + "\n3.Palhaco"
               + "\n4.Magico"
               + "\n5.Não é artista"
       );

        int op = Integer.parseInt(dado);
        
        
        
        
        switch (op){
            
            case 1:
                artista1 = new Malabarista("Malabarista");
                artista1.setNome(JOptionPane.showInputDialog("Insira seu nome: "));
                
                JOptionPane.showMessageDialog(null, "O senhor "+artista1.getNome()+" é um "+artista1.getCargo());
                
                break;
                
                
            case 2:
                
                artista1 = new Equilibrista("Equilibrista");
                artista1.setNome(JOptionPane.showInputDialog("Insira seu nome: "));
                
                JOptionPane.showMessageDialog(null, "O senhor "+artista1.getNome()+" é um "+artista1.getCargo());
                
                break;
                
                
            case 3:
                    artista1 = new Palhaco("Palhaco");
                artista1.setNome(JOptionPane.showInputDialog("Insira seu nome: "));
                
                JOptionPane.showMessageDialog(null, "O senhor "+artista1.getNome()+" é um "+artista1.getCargo());
                
                break;
                
                
            case 4:
                
                    artista1 = new Magico("MMagico");
                artista1.setNome(JOptionPane.showInputDialog("Insira seu nome: "));
                
                JOptionPane.showMessageDialog(null, "O senhor "+artista1.getNome()+" é um "+artista1.getCargo());
                
                break;
                
                
            case 5:
                    artista1 = new Artista("Zé ninguém");
                artista1.setNome(JOptionPane.showInputDialog("Insira seu nome: "));
                
                JOptionPane.showMessageDialog(null, "O senhor "+artista1.getNome()+" é um "+artista1.getCargo());
                break;
            
            
            
        }
        
        
        
    }
    
}
