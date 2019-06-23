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
public class Top extends Roupa {
    
    private boolean manga;
    private boolean gola;
    private boolean cropped;
 

    public Top(String material, String cor, float preco) {
        super(material, cor, preco);
    }

    public boolean isManga() {
        return manga;
    }

    public void setManga(boolean manga) {
        this.manga = manga;
    }

    public boolean isGola() {
        return gola;
    }

    public void setGola(boolean gola) {
        this.gola = gola;
    }

    public boolean isCropped() {
        return cropped;
    }

    public void setCropped(boolean cropped) {
        this.cropped = cropped;
    }
   
    
    
  
    
}
