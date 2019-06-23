/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesbasicas;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Operacao {

    
    Random gerador = new Random();
   
    double numero1 = gerador.nextInt(19+1);

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    
    double numero2 = gerador.nextInt(19+1);
    
    double resultado;
    
    public double calcularDivisao() {

        
        resultado = numero1 / numero2;
        
        return resultado;
    }

    public double calcularMultiplicacao() {

          resultado = numero1 * numero2;
        
        return resultado;

    }

    public double calcularSubtracao() {
        
          resultado = numero1 - numero2;
        return resultado;
    }

    public double calcularAdicao() {

          resultado = numero1 + numero2;
    
        return resultado;
    }

    public double calcularAreaRetangulo() {

        resultado = numero1*numero2;
        
      return resultado;
    }

}
