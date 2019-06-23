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
public class Principal {
    public static void main(String[] args) {
        
        
        Programadores pbackend = new Backend("Programador1","123asd456",true);
        Programadores pfrontend = new Frontend("192.168.0.1","546878",true);
        
        
        
        pbackend.desconectarComputador();
        pfrontend.desconectarComputador();
        
        
        
        
        
        
        
    }
}
