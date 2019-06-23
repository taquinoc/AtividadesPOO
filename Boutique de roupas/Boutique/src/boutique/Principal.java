/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

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
        
        
         
        
        
        
        String dado = JOptionPane.showInputDialog("Escolha a roupa que você quer cadastrar:"
                + "\n1.Top"
                + "\n2.Bottom"
                + "\n3.Casaco"
        );
        int op = Integer.parseInt(dado);
        
        
        switch (op){
            
            case 1:
                 Top roupa1 = new Top("Seda","Preto",300);
                dado = JOptionPane.showInputDialog("Você escolheu Top, ele possui mangas?:"
                        + "\n1. Sim"
                        + "\n2. Não");
                op = Integer.parseInt(dado);
                
                if (op == 1) {
                    roupa1.setManga(true);
                    System.out.println("A roupa agora possui manga: "+roupa1.isManga());
                } else {
                    System.out.println("A roupa possui manga: "+roupa1.isManga());
                }
                
                 dado = JOptionPane.showInputDialog("Com ou sem gola alta?:"
                        + "\n1. Sim"
                        + "\n2. Não");
                op = Integer.parseInt(dado);
                
                if (op == 1) {
                    roupa1.setGola(true);
                    System.out.println("A roupa agora possui gola alta: "+roupa1.isGola());
                } else {
                    System.out.println("A roupa não possui gola: "+roupa1.isGola());
                }
                
                
                
                
                
                dado = JOptionPane.showInputDialog("Cropped?:"
                        + "\n1. Sim"
                        + "\n2. Não");
                op = Integer.parseInt(dado);
                
                if (op == 1) {
                    roupa1.setCropped(true);
                    System.out.println("A roupa agora é cropped: "+roupa1.isCropped());
                } else {
                    System.out.println("A roupa não cropped: "+roupa1.isCropped());
                }
                
                
                break;
                
                
            case 2:
                Bottom roupa2 = new Bottom("Adamantium","Metal",30000);
                
                
               dado = JOptionPane.showInputDialog("Você escolheu Bottom, com ou seu bolsos?"
                        + "\n1.Com bolsos"
                        + "\n2.Sem bolsos");
                op = Integer.parseInt(dado);
                
                  if (op == 1) {
                    roupa2.setBolso(true);
                    System.out.println("A roupa agora possui bolso: "+roupa2.isBolso());
                } else {
                    System.out.println("A roupa não possui bolso: "+roupa2.isBolso());
                }
                  
                  
                  
                  
                   dado = JOptionPane.showInputDialog("Saia ou Calça?"
                        + "\n1.Saia"
                        + "\n2.Calça");
                op = Integer.parseInt(dado);
                
                  if (op == 1) {
                    roupa2.setSaia(true);
                    System.out.println("A roupa agora é uma saia: "+roupa2.isSaia());
                } else {
                      roupa2.setCalca(true);
                    System.out.println("A roupa agora é uma calca: "+roupa2.isCalca());
                }
                
                
                break;
                
                
            case 3:
                Casaco roupa3 = new Casaco("Couro","Flamejante",50000);
                dado = JOptionPane.showInputDialog("Você escolheu Casaco, ele possui Ziper?"
                        + "\n1.Sim"
                        + "\n2.Não");
                
                op = Integer.parseInt(dado);
                
                if (op == 1) {
                    roupa3.setZiper(true);
                    System.out.println("A roupa agora tem ziper: "+roupa3.isZiper());
                } else {
                     
                    System.out.println("A roupa agora não possui ziper: "+roupa3.isZiper());
                }
                
                
                
                dado = JOptionPane.showInputDialog("Ele possui botão ou é fechado?"
                        + "\n1.Com botões"
                        + "\n2.Fechado");
                
                op = Integer.parseInt(dado);
                
                if (op == 1) {
                    roupa3.setBotao(true);
                    System.out.println("A roupa agora tem botão "+roupa3.isBotao());
                } else if (op == 2){
                     roupa3.setFechado(true);
                    System.out.println("A roupa agora é fechada: "+roupa3.isFechado());
                }
                
                
                break;
         
            default:
                if (op != 1 || op != 2 || op != 3) {
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida, o programa irá encerrar");
                }
                System.out.println("Obrigado por usar o programa");
        }
        
        
    }   
}
