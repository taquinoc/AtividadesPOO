/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico;

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
      
        Medico medico1 = null;
        
        
        String dado = JOptionPane.showInputDialog("Olá, doutor! Informe sua especialidade:"
                + "\n1.Cirurgiao"
                + "\n2.Pediatra");
        
        int op = Integer.parseInt(dado);
        
        
        switch (op){
            
            case 1:
                medico1 = new Cirurgiao();
                medico1.setEspecialidade("Cirurgião");
                medico1.setNome(JOptionPane.showInputDialog("Insira o nome do médico: "));
                medico1.setProceedimentos(JOptionPane.showInputDialog("Insira seus procedimentos:"));
                
                JOptionPane.showMessageDialog(null, "O médico se chama "+medico1.getNome()+" e é um "+medico1.getEspecialidade()+" e faz tais procedimentos: "+medico1.getProceedimentos());
                
                break;
                
            case 2:
                
                medico1 = new Pediatra();
                medico1.setEspecialidade("Pediatra");
                medico1.setNome(JOptionPane.showInputDialog("Insira o nome do médico: "));
                medico1.setProceedimentos(JOptionPane.showInputDialog("Insira seus procedimentos:"));
                
                JOptionPane.showMessageDialog(null, "O médico se chama "+medico1.getNome()+" e é um "+medico1.getEspecialidade()+" e faz tais procedimentos: "+medico1.getProceedimentos());
                
                
                
                break;
                
            default:
                if(op != 1 || op != 2){
                    JOptionPane.showMessageDialog(null, "Insira uma opção válida, por gentileza!");
                }
                
                
        }
        
        
    }
    
}
