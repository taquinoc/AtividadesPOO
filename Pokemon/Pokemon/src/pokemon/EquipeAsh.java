/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EquipeAsh extends Pokemon{
    
    public void DeixarPikachu() {
   JOptionPane.showMessageDialog(null, "Você pediu gentilmente que deixem o Pikachu, mas eles recusaram."
                            + "Você falhou em sua missão.");
    }

    public void Lutar() {
JOptionPane.showMessageDialog(null, "Você atacou a Equipe Rocket, você conseguiu explodi-los de alguma forma. "
                            + "Você venceu!");
    }

    public void Escapar() {
JOptionPane.showMessageDialog(null, "Você avistou a equipe Rocket e decidiu fugir, mas teve que lutar contra eles e acabou explodindo-os. Você venceu!");
    }
    
}
