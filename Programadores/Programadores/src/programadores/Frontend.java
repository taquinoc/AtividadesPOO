/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadores;

/**
 *
 * @author e6661387
 */
public class Frontend extends Programadores {
    
    
    private String url;
    private String FTP;

    public Frontend(String url, String FTP, boolean computadorLigado) {
        super(computadorLigado);
        this.url = url;
        this.FTP = FTP;
    }

 
      public void desconectarComputador(){
      
      if(super.computadorLigado == true){
          System.out.println("O frontend agora se desconecta do FTP");
      } else {
          System.out.println("O frontend permanece conectado");
      }
      
  }
    
    
    
    
}
