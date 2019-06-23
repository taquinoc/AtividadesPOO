/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

/**
 *
 * @author e6661387
 */
public class Bottom extends Roupa{
    private boolean bolso;
       private boolean saia;
    private boolean calca;

    public Bottom(String material, String cor, float preco) {
        super(material, cor, preco);
    }
    

    public boolean isBolso() {
        return bolso;
    }

    public void setBolso(boolean bolso) {
        this.bolso = bolso;
    }

    public boolean isSaia() {
        return saia;
    }

    public void setSaia(boolean saia) {
        this.saia = saia;
    }

    public boolean isCalca() {
        return calca;
    }

    public void setCalca(boolean calca) {
        this.calca = calca;
    }
 
    
 
    
}
