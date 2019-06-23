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
public class Artista {
    
    private String nome;
  private String cargo;
  
    public Artista(String cargo) {
        this.cargo = cargo;
    }
  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

        
  
    
    
    
}
