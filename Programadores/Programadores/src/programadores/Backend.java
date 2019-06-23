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
public class Backend extends Programadores {
    
    private String login;
    private String senha;

    public Backend(String login, String senha, boolean computadorLigado) {
        super(computadorLigado);
        this.login = login;
        this.senha = senha;
    }

  public void desconectarComputador(){
      
      if(super.computadorLigado == true){
          System.out.println("O backend agora se desconecta do BD");
      } else {
          System.out.println("O backend permanece conectado");
      }
      
  }
    
    
    


    
    
    
    
    
}
