/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author e6661387
 */
public class Hatch extends Carro{

    public Hatch(String nome, int ano) {
        super(nome, ano);
    }
 

    
       public String getNome() {
        return "Nome do carro: "+super.nome+" O ano é: "+super.ano ;
    }
 
}
