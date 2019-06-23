/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inimigosdoritmo;

/**
 *
 * @author e6661387
 */
public class Principal {
    public static void main(String[] args) {
        
        
        Instrumento viola = new Viola();
        Instrumento sanfona = new Sanfona();
        
        
        viola.CadastrarInstrumento();
        sanfona.CadastrarInstrumento();
        
        
        
        
        System.out.println("Instrumentos cadastrados: "+viola.getCadastrarInstrumento()+" e "+sanfona.getCadastrarInstrumento());
        
        
    }
}
