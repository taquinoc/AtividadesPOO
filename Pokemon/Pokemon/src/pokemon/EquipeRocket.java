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
public class EquipeRocket extends Pokemon{
    
    public void PegaPikachu() {
 JOptionPane.showMessageDialog(null, "Você pediu gentilmente que passasem  o Pikachu, mas eles recusaram."
                            + "Você falhou em sua missão.");
    }

    public void TentarPegar() {
JOptionPane.showMessageDialog(null, "Você atacou a Equipe do Ash, eles explodiram vocês de alguma forma "
                            + "e você decolou de novo com a Equipe Rocket. Você falhou em sua missão");
    }

    public void Fugir() {
JOptionPane.showMessageDialog(null, "A euipe do Ash como são bonzinhos deixaram vocês escaparem.");
    }

  
}
