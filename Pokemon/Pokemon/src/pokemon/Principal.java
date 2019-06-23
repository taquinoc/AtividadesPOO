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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pokemon jogador = null;

        int op = Integer.parseInt(JOptionPane.showInputDialog("Qual equipe você fará parte?\n 1 - Equipe Rocket\n2 - Equipe Ash"));
        switch (op) {
            case 1:

                jogador = new EquipeRocket();
                jogador.setNome(JOptionPane.showInputDialog("Qual seu nome?"));
                JOptionPane.showMessageDialog(null, "Você escolheu a Equipe Rocket! Você deverá escolher a próxima ação."
                );

                int dado = Integer.parseInt(JOptionPane.showInputDialog("1 - Pedir para entregarem pacificamnete o Pikachu."
                        + "\n2 - Tentar tomar o Pikachu a força."
                        + "\n3 - Fugir."));
                if (dado == 1) {
                    jogador.PegaPikachu();
                }
                if (dado == 2) {
                    jogador.TentarPegar();

                }
                if (dado == 3) {
                    jogador.Fugir();

                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você escolheu a Equipe do Ash! Você deverá escolher a próxima ação."
                );
                jogador = new EquipeAsh();
                jogador.setNome(JOptionPane.showInputDialog("Qual seu nome?"));
                int dados = Integer.parseInt(JOptionPane.showInputDialog("1 - Pedir para a Equipe Rocket se retirarem pacificamente."
                        + "\n2 - Tentar impedir a Equipe Rocket a força."
                        + "\n3 - Fugir."));
                if (dados == 1) {
                    jogador.DeixarPikachu();

                }
                if (dados == 2) {
                    jogador.Lutar();

                }
                if (dados == 3) {
                    jogador.Escapar();

                }
                break;
        }
        JOptionPane.showMessageDialog(null, jogador.getNome());
    }
}
