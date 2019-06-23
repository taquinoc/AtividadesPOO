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
public class Programadores {

    protected boolean computadorLigado;

    public Programadores (boolean computadorLigado){
        
        this.computadorLigado = computadorLigado;
        
    }
    
    
    
    public void desconectarComputador(){
        
        if(computadorLigado == true){
            
            System.out.println("O computador agora será desconectado");
        } else {
            System.out.println("O computador encontra-se desconectado");
        }
        
    }
    
    
}
